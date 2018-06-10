package com.polaris.he.website.arrange.service;

import com.polaris.he.website.arrange.entity.ScheduledResult;
import com.polaris.he.website.arrange.entity.School;
import com.polaris.he.website.arrange.entity.Student;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

/**
 * User: hexie
 * Date: 2018/6/4 23:34
 * Description:
 */
public interface ScheduleService {

    /**
     * 根据起始时间和学生进行排班
     *
     * @param start
     * @param end
     * @param students
     * @return
     */
    ScheduledResult execute(List<School> students);

    /**
     * 根据排班结果进行微调
     *
     * @param detail
     * @return
     */
    ScheduledResult execute(ScheduledResult detail);

}