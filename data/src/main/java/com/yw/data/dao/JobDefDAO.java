package com.yw.data.dao;



import com.yw.data.po.JobDefPO;

import java.util.List;

/**
 *@description 任务定义接口
 *@author yuanwei
 *@time 2020/12/24 21:24
 */
public interface JobDefDAO {

    /**
     * @description 查询所有任务
     * @author zhouyuxiang
     * @param
     * @return List<JobDef>
     * @time 2020/12/24 21:22
     */
    List<JobDefPO> listAll();
}
