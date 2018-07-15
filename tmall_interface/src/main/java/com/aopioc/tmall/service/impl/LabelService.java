package com.aopioc.tmall.service.impl;

import com.aopioc.tmall.entity.Label;

import java.util.List;

/**
 * author by JefferyChang on  2018/7/19
 */
public interface LabelService  {

    public List<Label> findAll();

    public Label findById(String id);

    public void add(Label label);

    public void update(Label label);

    public void deleteById(String id);

}
