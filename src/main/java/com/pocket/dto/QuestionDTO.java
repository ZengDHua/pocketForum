package com.pocket.dto;

import com.pocket.model.User;
import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/13 18:40
 */
@Data
public class QuestionDTO {
    private Long id;

    private String title;

    private String description;

    private Long creator;

    private String tag;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    private Long gmtCreate;

    private Long gmtModified;

    private User user;
}
