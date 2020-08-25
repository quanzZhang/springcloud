package com.wonder.poro;

import com.fasterxml.jackson.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@JsonPropertyOrder(value = {"content","title"})
public class Article {
    @JsonIgnore
    private long id;
    @JsonProperty(value = "ahther")
    private String author;
    private String title;
    private  String content;
    @JsonFormat(pattern = "yyyy/MM/dd hh:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<User> user;
}
