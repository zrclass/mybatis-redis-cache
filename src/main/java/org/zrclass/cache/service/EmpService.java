package org.zrclass.cache.service;

import org.zrclass.cache.common.entity.Emp;

import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 13:41
 */
public interface EmpService {
    List<Emp> findAll();

    void add(Emp emp);

    void update(String empName, Long id);

    Emp findById(Long id);
}
