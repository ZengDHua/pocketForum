package com.pocket.dto;

import com.pocket.model.User;
import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/27 21:10
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
