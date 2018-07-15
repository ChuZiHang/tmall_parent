package com.aopioc.tmall.base.dao;

import com.aopioc.tmall.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 标签的数据访问层
 * author by JefferyChang on  2018/7/18
 */
public interface LabelDao extends JpaRepository<Label,String>  ,JpaSpecificationExecutor<Label> {





}
