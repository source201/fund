package com.yw.data.bo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class FundNetWorthBO {

    // 基金编码
    private String fundcode;

    //基金名称
    private String name;

    // 当前最近交易日的上一交易日日期
    private String jzrq;

    // 当前最近交易日的上一交易日净值
    private Double dwjz;

    // 当前最近交易日净值
    private Double gsz;

    // 当前最近交易日涨幅
    private Double gszzl;

    // 当前最近交易日
    private String gztime;
}
