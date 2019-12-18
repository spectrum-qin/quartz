package com.example.admin.dao;

import com.example.admin.data.JobAndTrigger;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by haoxy on 2018/9/28.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Repository
@Mapper
public interface JobAndTriggerDao {

    List<JobAndTrigger> getJobAndTriggerDetails();
}
