package com.cn.myservice.controller;


import com.cn.myservice.common.R;
import com.cn.myservice.entity.Menu;
import com.cn.myservice.service.IMenuService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ruanhua
 * @since 2022-01-09
 */
@RestController
@Slf4j
@RequestMapping("/menu")
@Tag(name = "获取菜单接口", description = "树形菜单")
public class MenuController {
    @Resource
    private IMenuService iMenuService;

    @Operation(summary = "获取树形菜单", description = "全量菜单权限")
    @GetMapping("/menuTree")
    public R<List<Menu>> getResource() {
        return iMenuService.getAllMenuTree();
    }
}
