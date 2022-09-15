package com.cn.myservice.controller;


import com.cn.myservice.common.R;
import com.cn.myservice.service.IMarkdownService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/md")
@Tag(name = "获取菜单接口", description = "树形菜单")
public class MarkDownController {
    @Resource
    private IMarkdownService markdownService;

    @GetMapping("/getMD/{id}")
    public R<String> getResource(@PathVariable Integer id) {
       return R.success(markdownService.getById(id).getMddesc());
    }

    @GetMapping("/getEnMD/{id}")
    public R<String> getEnResource(@PathVariable Integer id) {
        return R.success(markdownService.getById(id).getMddescEn());
    }

}
