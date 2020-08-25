package com.wonder.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wonder.mapper1.FlowerMapper;
import com.wonder.poro.Article;
import com.wonder.poro.Flower;
import com.wonder.poro.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
    @Autowired
    FlowerMapper flowerMapper;
    @Test
    public void testDataToJson() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        List<User> users=new ArrayList<>();
        User user=User.builder().age(19).name("zq").build();
        users.add(user);
        Article article=Article.builder()
                .id(1)
                .author("张骞")
                .content("spring 学习指导")
                .createTime(new Date())
                .title("a1").user(users).build();
        String jsonStr=mapper.writeValueAsString(article);
        System.out.println(jsonStr);
        Article article1=mapper.readValue("{\"content\":\"spring 学习指导\",\"title\":\"a1\",\"createTime\":\"2020/08/06 04:38:00\",\"user\":[{\"name\":\"zq\",\"age\":19}],\"ahther\":\"张骞\"}",
                Article.class);
        System.out.println(article1);
    }
    @Test
    public void test1(){
        Flower flower=flowerMapper.findAll(3);
        System.out.println(flower);

        }


}
