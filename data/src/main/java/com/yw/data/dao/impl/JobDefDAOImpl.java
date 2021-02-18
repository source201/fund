package com.yw.data.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Condition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yw.core.exception.DAOException;
import com.yw.data.dao.JobDefDAO;
import com.yw.data.mapper.JobDefMapper;
import com.yw.data.po.JobDefPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@description 任务定义实现
 *@author yuanwei
 *@time 2020/12/24 21:24
 */
@Service
@Slf4j
public class JobDefDAOImpl extends ServiceImpl<JobDefMapper, JobDefPO> implements JobDefDAO {


    @Override
    public List<JobDefPO> listAll() {
        List<JobDefPO> result = null;
        final QueryWrapper<JobDefPO> wrapper = Condition.create();
        try {
            result = this.list(wrapper);
        } catch (final Exception e) {
            log.error("查询定时任务定义异常：{}，{}", e.getMessage(), e);
            throw new DAOException("查询定时任务定义失败");
        }
        return result;
    }
}
