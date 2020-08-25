package com.wonder;

import lombok.Builder;
import lombok.Data;

@Data
public class AjaxResponse {
    private  boolean isok; //请求成功
    private int code; //200,400,500
    private String message;  //描述
    private Object data;    //需要返回的数据
    //无参构造方法
    public AjaxResponse(){
    }
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setIsok(true);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setIsok(true);
        ajaxResponse.setMessage("请求成功");
        return ajaxResponse;
    }
}
