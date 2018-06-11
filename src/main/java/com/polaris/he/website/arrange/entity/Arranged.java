package com.polaris.he.website.arrange.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * 从begin到end日期中，department安排了school，包含students
 * User: hexie
 * Date: 2018/6/10 23:38
 * Description:
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Arranged {

    private Department department;

    private School school;

    private Student student;

    private LocalDate begin;

    private LocalDate end;
}