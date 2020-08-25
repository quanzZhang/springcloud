package com.wonder;

import com.wonder.poro.User;
import org.mapstruct.MapperConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wonder.*")
@MapperScan("com.wonder.mapper")
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);

    }

}
