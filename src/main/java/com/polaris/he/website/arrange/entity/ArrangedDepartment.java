package com.polaris.he.website.arrange.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 从begin到end日期中，department安排了school，包含students
 * User: hexie
 * Date: 2018/6/10 23:38
 * Description:
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ArrangedDepartment {

    @NonNull
    private Department department;

    @NonNull
    private School school;


    private List<Student> students;

    @NonNull
    private LocalDate begin;

    @NonNull
    private LocalDate end;
}