package org.zrclass.cache.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 11:47
 */
@Data
public class Emp implements Serializable {
    private Long id;
    private Long userId;
    private String empName;
    private Date birthday;
    private String password;
    private Integer gender;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", userId=" + userId +
                ", empName='" + empName + '\'' +
                ", birthday=" + birthday +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}
