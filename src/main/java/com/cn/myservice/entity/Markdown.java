package com.cn.myservice.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author ruanhua
 * @since 2022-08-22
 */
@Data
public class Markdown {

    private Long id;

    private String title;

    private String mddesc;

    private String mddescEn;

    private LocalDateTime dtime;

    private LocalDateTime ctime;

}
