package com.wonder.poro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

   // private static final Logger log=LoggerFactory.getLogger(User.class);
    private String name;
    private Integer age;
}
