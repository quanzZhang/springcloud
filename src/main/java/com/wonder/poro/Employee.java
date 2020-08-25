package com.wonder.poro;

import com.wonder.service.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Data
@Configuration
@PropertySource(value = "classpath:employee.yml",encoding = "utf-8",factory = MixPropertySourceFactory.class)
public class Employee {
    @Value("#{'${employee.names}'.split('\\,')}")
    private List<String> employeeNames;
//    @Value("#{'${employee.names}'.split('\\,')[0]}")
//    private List<String> firstEmployeeNames;
//    @Value("#{${employee.age}}")
//    private Map<String, Integer> employeeAge;
//    @Value("#{${employee.age}}[0]")
//    private Map<String, Integer> employeeAge1;
//    @Value("#{${employee.age}.two}")
//    private Integer employeeAge2;

}
