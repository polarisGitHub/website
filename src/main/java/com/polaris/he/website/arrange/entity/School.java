package com.polaris.he.website.arrange.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

/**
 * User: hexie
 * Date: 2018/6/4 23:30
 * Description:
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class School {

    private String id;

    // 学校名称
    private String name;

    // 实习科目和对应的实习时间
    private Map<Department, Period> department;

    // 实习开始时间
    private LocalDate begin;

    // 实习结束时间
    private LocalDate end;

    // 学生
    private List<Student> students;
}