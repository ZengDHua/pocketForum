package com.pocket.dto;

import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/10 13:32
 */
@Data
public class GithubUser {
    private Long id;

    private String name;

    private String bio;

    private String avatarUrl;
}
