package com.aopioc.tmall.web;




import com.alibaba.dubbo.config.annotation.Reference;
import com.aopioc.tmall.entity.Label;
import com.aopioc.tmall.entity.Result;
import com.aopioc.tmall.entity.StatusCode;
import com.aopioc.tmall.service.impl.LabelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author by JefferyChang on  2018/7/18
 */
@RestController
//js跨域访问
@CrossOrigin
@RequestMapping("/label")
public class LabelController {

    @Reference(version = "1.0.0")
    private LabelService labelService;


    @GetMapping("/")
    private Result findAll(){
        List<Label> list = labelService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",list);
    }





}
