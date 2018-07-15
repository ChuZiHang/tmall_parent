package com.aopioc.tmall.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 返回的分页结果类
 * author by JefferyChang on  2018/7/18
 */
public class PageResult<T> implements Serializable {

        private Long total;//总记录数

        private List<T> rows;//数据

        public Long getTotal() {
            return total;
        }

        public void setTotal(Long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
}
