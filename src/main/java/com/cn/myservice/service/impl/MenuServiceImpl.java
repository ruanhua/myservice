package com.cn.myservice.service.impl;

import com.cn.myservice.common.R;
import com.cn.myservice.entity.Menu;
import com.cn.myservice.mapper.MenuMapper;
import com.cn.myservice.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ruanhua
 * @since 2022-01-09
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Override
    public R<List<Menu>> getAllMenuTree() {
        List<Menu> menuList = this.list();
        //获取父节点
        List<Menu> collect = menuList.stream().filter(m -> m.getPreMenuCode().equals("M00")).peek(
                (m) -> m.setChildList(getChildrens(m, menuList))
        ).collect(Collectors.toList());
        return R.success(collect);
    }
    /**
     * 递归查询子节点
     * @param root  根节点
     * @param all   所有节点
     * @return 根节点信息
     */
    private List<Menu> getChildrens(Menu root, List<Menu> all) {
        List<Menu> children = all.stream().filter(m -> {
            return Objects.equals(m.getPreMenuCode(), root.getMenuCode());
        }).map(
                (m) -> {
                    m.setChildList(getChildrens(m, all));
                    return m;
                }
        ).collect(Collectors.toList());
        return children;
    }
}
