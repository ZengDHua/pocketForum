package com.pocket.dto;

import lombok.Data;

/**
 * @auther Akie
 * @date 2019/10/10 13:03
 */
@Data
public class AccessTokenDTO {
    private String client_id;

    private String client_secret;

    private String code;

    private String redirect_uri;

    private String state;
}
