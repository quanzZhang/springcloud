package com.wonder.springboot;

import com.wonder.controller.ArticleController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class ArticleRestControllerTest2 {
    //帮助我们模拟发送http请求
    @Resource
    private  MockMvc mockMvc;
    @Before
//   public void setUp(){
//        mockMvc=MockMvcBuilders.standaloneSetup(new ArticleController()).build();
//        //需要对那个controller测试在里面就加入什么，也可以在容器里面加
//    }
    @Test
    public void saveArticle() throws Exception{
        String article="{\"content\":\"spring 学习指导\",\"title\":\"a1\",\"createTime\":\"2020/08/06 04:40:02\",\"user\":[{\"name\":\"zq\",\"age\":19}],\"ahther\":\"张骞\"}";
        //用 mockMvc模拟请求
        MvcResult mvcResult=mockMvc.perform(
                MockMvcRequestBuilders
                        .request(HttpMethod.POST,"/rest/articles")
                        .contentType("application/json")
                        .content(article)

        ).andExpect(MockMvcResultMatchers.status().isOk())  //http:status 200,及浏览器上的返回为200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.ahther").value("张骞"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.user[0].age").value(19))
                .andReturn();
        log.info(String.valueOf(mvcResult));
    }

}
