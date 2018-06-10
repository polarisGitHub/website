package com.polaris.he.website.arrange.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User: hexie
 * Date: 2018/6/5 22:24
 * Description:
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Student {

    private String id;

    // 姓名
    private String name;

    // 性别
    private String sex;
}