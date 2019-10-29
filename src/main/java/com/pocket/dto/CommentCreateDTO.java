package com.pocket.dto;

import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/21 22:13
 */
@Data
public class CommentCreateDTO {
    private Long parentId;

    private String content;

    private Integer type;
}
