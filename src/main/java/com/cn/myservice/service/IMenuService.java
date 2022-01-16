package com.cn.myservice.service;

import com.cn.myservice.common.R;
import com.cn.myservice.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ruanhua
 * @since 2022-01-09
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 获取所有的菜单信息
     * @return
     */
    R<List<Menu>> getAllMenuTree();

}
