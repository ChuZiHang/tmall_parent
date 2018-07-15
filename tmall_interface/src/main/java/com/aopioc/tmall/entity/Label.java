package com.aopioc.tmall.entity;

import java.io.Serializable;

/**
 * author by JefferyChang on  2018/7/18
 */
public class Label implements Serializable {


    private String id;

    private String labelname;

    private String state;

    private Long count;//使用数量

    private Long funs;

    private String recommend;//是否推荐

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getFuns() {
        return funs;
    }

    public void setFuns(Long funs) {
        this.funs = funs;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
