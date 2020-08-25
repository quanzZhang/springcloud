package com.wonder.controller;

import com.wonder.AjaxResponse;
import com.wonder.mapper1.ArticlesMapper;
import com.wonder.poro.Article;
import com.wonder.service.ArticcleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {
    /**
     * 依据id查询文章
     * @param id
     * @return
     */
    @Resource
    ArticlesMapper articlesMapper;
    @Resource
    ArticcleService articcleService;

    @RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
    public AjaxResponse getArticle(@PathVariable("id") long id){
        Article article=Article.builder()
                .id(1)
                .author("张骞")
                .content("spring 学习指导")
                .createTime(new Date())
                .title("a1").build();
        log.info("article:"+ article);

        return AjaxResponse.success(article);
    }
    @RequestMapping(value = "/articles",method = RequestMethod.GET)
    public AjaxResponse getArticle(){
        List<Article> article=articlesMapper.findAll();
        log.info("article:"+ article);

        return AjaxResponse.success(article);
    }
    /**
     * 新增一篇文章，写法一
     */
    @RequestMapping(value = "/articles",method = RequestMethod.POST)
    public AjaxResponse saveArticle(@RequestBody Article article){
        log.info("saveArticle:"+article);
        return AjaxResponse.success(article);
    }
//    //写法二
//    @RequestMapping(value = "/articles",method = RequestMethod.POST)
//    public AjaxResponse saveArticle(@RequestParam String author,
//                                    @RequestParam String title,
//                                    @RequestParam String content,
//                                    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
//                                    @RequestParam Date createTime){
//        log.info("saveArticle:"+author+"---"+title+"---"+content+"---"+createTime);
//        return AjaxResponse.success();
//    }
//    //写法三，请求头传参
//    @RequestMapping(value = "/articles",method = RequestMethod.POST)
//    public AjaxResponse saveArticle(@RequestHeader String a){
//        log.info("saveArticle:"+a);
//        return AjaxResponse.success();
//    }

    /**
     * 更新一篇文章
     */
    @RequestMapping(value = "/articles",method = RequestMethod.PUT)
    public AjaxResponse updateArticle(@RequestBody Article article){
//        if(null == article.getId()){
//            //TODO 抛出一个自定义异常
//        }
        log.info("updateArticle:"+article);
        return AjaxResponse.success();
    }
    /**
     * 删除一篇文章
     */
    @RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    public AjaxResponse deleteArticle(@PathVariable("id") long id){
        log.info("deleteArticle:"+id);
        return AjaxResponse.success();
    }
}
