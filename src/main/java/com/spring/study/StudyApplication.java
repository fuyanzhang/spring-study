package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName StudyApplication
 * @Author fuyanzhang
 * @Date 2019/11/10 0010 下午 15:47
 * @Description TODO
 **/
@SpringBootApplication
//@Configuration
//@Import(AutoConfigurationImportSelector.class)
public class StudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class);
    }
}
