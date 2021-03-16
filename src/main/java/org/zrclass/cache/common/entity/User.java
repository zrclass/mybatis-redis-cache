package org.zrclass.cache.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 11:45
 */
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private Date birthday;
    private Integer gender;
    private List<Emp> empList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", empList=" + empList +
                '}';
    }
}
