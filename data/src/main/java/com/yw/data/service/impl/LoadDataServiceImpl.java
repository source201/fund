package com.yw.data.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.yw.core.utils.JsonUtil;
import com.yw.data.bo.FundNetWorthBO;
import com.yw.data.service.LoadDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletException;
import java.nio.charset.StandardCharsets;


@Service
@Slf4j
public class LoadDataServiceImpl implements LoadDataService {

    @Value("${api.dayfund.networth}")
    private String netWorthUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void getFundNetWorth(String fundCode) {
        String apiUrl = StrUtil.format(netWorthUrl, fundCode);
        log.info("url：{}", apiUrl);
//        FundNetWorthBO fundNetWorthBO= restTemplate.getForObject(apiUrl, FundNetWorthBO.class);
//        log.info("净值详情：{}",fundNetWorthBO);
        String responStr = StrUtil.EMPTY;
        responStr = restTemplate.getForObject(apiUrl, String.class);

        String str1 = new String(responStr.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        FundNetWorthBO fundNetWorthBO =handleGSJZData(str1);
        log.info("净值详情：{}", fundNetWorthBO);
    }

    //处理估算净值
    private FundNetWorthBO handleGSJZData(String data) {

        int start = data.indexOf("(");
        int end = data.indexOf(")");
        FundNetWorthBO fundNetWorthBO = null;
        if (start < end && start > 0) {
            String jsonData = data.substring(start + 1, end);
            fundNetWorthBO = JsonUtil.string2Obj(jsonData,FundNetWorthBO.class);
        }
        return fundNetWorthBO;
    }
}
