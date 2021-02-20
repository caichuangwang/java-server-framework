package com.jsf.server.controller;

import com.jsf.common.viewmodel.JsfReturn;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName JsfController
 * @Description
 * @Author caicw
 * @Date 2021/2/20 19:18
 */
@RestController
@RequestMapping("/api")
public class JsfController {
    /**
     * 新增
     *
     * @param name
     * @param viewModelJson
     * @return
     */
    @PostMapping("/{name}")
    public JsfReturn add(@PathVariable("name") String name, @RequestBody String viewModelJson) throws Exception {

        return JsfReturn.successData(null);
    }

    /**
     * 删除
     *
     * @param name
     * @param id
     * @return
     */
    @DeleteMapping("/{name}/{id}")
    public JsfReturn delete(@PathVariable("name") String name, @PathVariable("id") String id) throws Exception {
        return JsfReturn.successData(null);
    }

    /**
     * 修改
     *
     * @param name
     * @param viewModelJson
     * @return
     */
    @PutMapping("/{name}")
    public JsfReturn update(@PathVariable("name") String name, @RequestBody String viewModelJson) throws Exception {
        return JsfReturn.successData(null);
    }

    /**
     * 查询所有
     *
     * @param name
     * @param condition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/{name}")
    public JsfReturn getObjects(@PathVariable("name") String name,
                                @RequestParam(value = "condition", required = false, defaultValue = "") String condition,
                                @RequestParam(value = "pageIndex", required = false, defaultValue = "0") int pageIndex,
                                @RequestParam(value = "pageIndex", required = false, defaultValue = "100") int pageSize) throws Exception {
        return JsfReturn.successData(null);
    }

    /**
     * 查询单个
     *
     * @param name
     * @param id
     * @return
     */
    @GetMapping("/{name}/{id}")
    public JsfReturn getObjectByKey(@PathVariable("name") String name, @PathVariable("id") String id) throws Exception {
        return JsfReturn.successData(null);
    }
}
