package com.wonder.springboot;

import com.wonder.poro.Employee;
import com.wonder.poro.Family;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class ValueBindTest {
    @Resource
    Family family;
    @Resource
    Employee employee;
    @Test
    public void valueBindTest() {
        System.out.println(family);
    }
    @Test
    public void valueBindTest2(){
        System.out.println(employee);
    }
}

