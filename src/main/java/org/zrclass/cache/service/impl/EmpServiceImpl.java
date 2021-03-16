package org.zrclass.cache.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zrclass.cache.common.entity.Emp;
import org.zrclass.cache.dao.EmpMapper;
import org.zrclass.cache.service.EmpService;

import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 13:42
 */
@Service
@Slf4j
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public void add(Emp emp) {
         empMapper.add(emp);
    }

    @Override
    public void update(String empName, Long id) {
        empMapper.updateEmpNameById(empName,id);
    }

    @Override
    public Emp findById(Long id) {
        return empMapper.findOne(id);
    }
}
