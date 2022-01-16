package com.cn.myservice.entity;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author ruanhua
 * @since 2022-01-09
 */
@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    private String menuCode;

    private String preMenuCode;

    private String menuName;

    private Integer menuLevel;

    private String url;

    @TableField(exist = false)
    private List<Menu> childList;

}
