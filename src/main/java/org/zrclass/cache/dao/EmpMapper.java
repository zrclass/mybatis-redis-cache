package org.zrclass.cache.dao;

import org.apache.ibatis.annotations.Param;
import org.zrclass.cache.common.entity.Emp;

import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 12:28
 */
public interface EmpMapper {

    List<Emp> findAll();

    void add(Emp emp);

    void updateEmpNameById(@Param("empName") String empName,@Param("id") Long id);

    Emp findOne(@Param("id") Long id);
}
