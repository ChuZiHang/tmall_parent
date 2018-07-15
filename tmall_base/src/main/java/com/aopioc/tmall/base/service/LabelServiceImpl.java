package com.aopioc.tmall.base.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.aopioc.tmall.base.dao.LabelDao;
import com.aopioc.tmall.entity.IdWorker;
import com.aopioc.tmall.entity.Label;
import com.aopioc.tmall.service.impl.LabelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * author by JefferyChang on  2018/7/18
 */
@Service(version = "1.0.0")
public class LabelServiceImpl  implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    @Override
    public List<Label> findAll() {
        List<Label> list = labelDao.findAll();
        return list;
    }

    @Override
    public Label findById(String id) {
        return labelDao.findById(id).get();
    }

    @Override
    public void add(Label label) {
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }

    @Override
    public void update(Label label) {
        labelDao.save(label);
    }

    @Override
    public void deleteById(String id) {
        labelDao.deleteById(id);
    }















}
