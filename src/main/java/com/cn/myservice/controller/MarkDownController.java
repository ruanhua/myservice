package com.cn.myservice.controller;


import com.cn.myservice.common.R;
import com.cn.myservice.service.IMarkdownService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/md")
@Tag(name = "获取菜单接口", description = "树形菜单")
public class MarkDownController {
    @Resource
    private IMarkdownService markdownService;

    @GetMapping("/getMD")
    @CrossOrigin
    public R<String> getResource() {
       return R.success(markdownService.getById(1233444).getMddesc());
    }

    @GetMapping("/getEnMD")
    @CrossOrigin
    public R<String> getEnResource() {
        return R.success(markdownService.getById(1233444).getMddescEn());
    }

}
