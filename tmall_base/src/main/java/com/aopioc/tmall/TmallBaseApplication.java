package com.aopioc.tmall;

import com.aopioc.tmall.entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TmallBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallBaseApplication.class, args);
    }


    @Bean
    public IdWorker idWorker(){
        return  new IdWorker(1,1);
    }

}
