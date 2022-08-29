package com.cn.myservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.myservice.entity.Markdown;
import com.cn.myservice.mapper.MarkdownMapper;
import com.cn.myservice.service.IMarkdownService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ruanhua
 * @since 2022-08-22
 */
@Service
public class MarkdownServiceImpl extends ServiceImpl<MarkdownMapper, Markdown> implements IMarkdownService {

}
