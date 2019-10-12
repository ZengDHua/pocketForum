package com.pocket.model;

import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/11 16:29
 */
@Data
public class Question {
    private Integer id;

    private String title;

    private String description;

    private Integer creator;

    private String tag;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    private Long gmtCreate;

    private Long gmtModified;
}
