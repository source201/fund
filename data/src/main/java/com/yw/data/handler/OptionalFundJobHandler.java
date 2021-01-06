package com.yw.data.handler;

import com.yw.data.service.LoadDataService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @description
 * @author yuanwei
 * @date 2021/1/6 14:00
 */
@Slf4j
public class OptionalFundJobHandler implements Job {

    @Autowired
    private LoadDataService loadDataService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date time = new Date();
        loadDataService.getFundNetWorth("320007");
        log.info("时间：{}，打印",time);
    }
}
