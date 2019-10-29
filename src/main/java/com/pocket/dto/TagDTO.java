package com.pocket.dto;

import lombok.Data;

import java.util.List;

/**
 * @auther Akie
 * @date 2019/10/29 13:27
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
