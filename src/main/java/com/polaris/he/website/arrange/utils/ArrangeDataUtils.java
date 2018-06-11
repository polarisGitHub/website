package com.polaris.he.website.arrange.utils;

import com.polaris.he.website.arrange.entity.Department;
import com.polaris.he.website.arrange.entity.Student;
import com.polaris.he.website.arrange.holder.ArrangedDataHolder;

import java.time.LocalDate;

/**
 * User: hexie
 * Date: 2018/6/10 23:25
 * Description:
 */
public class ArrangeDataUtils {

    /**
     * 这个学生在这段时间，在该科室是否有空
     *
     * @param holder
     * @param student
     * @param department
     * @param currentDate
     * @return
     */
    public static boolean isStudentFree(ArrangedDataHolder holder, Student student, Department department, LocalDate currentDate) {
        return true;
    }
}