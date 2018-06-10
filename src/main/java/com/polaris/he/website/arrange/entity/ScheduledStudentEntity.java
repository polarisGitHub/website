package com.polaris.he.website.arrange.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

/**
 * User: hexie
 * Date: 2018/6/5 22:42
 * Description:
 */
@Getter
@Setter
@ToString
public class ScheduledStudentEntity {

    // 学校
    private School school;

    // 学生
    private Student student;

    // 分配科室
    private Department department;

    // 起始时间
    private LocalTime begin;

    // 结束时间
    private LocalTime end;
}