package com.polaris.he.website.arrange.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * User: hexie
 * Date: 2018/6/4 23:37
 * Description:
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Department {

    private String id;

    // 科目名称
    private String name;

    // 最低人数
    private int needStudents;
}