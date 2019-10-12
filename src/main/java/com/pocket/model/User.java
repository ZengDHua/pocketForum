package com.pocket.model;

import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/10 19:51
 */
@Data
public class User {
    private Integer id;

    private  String name;

    private String accountId;

    private String token;

    private Long gmtCreate;

    private Long gmtModified;

    private String avatarUrl;
}
