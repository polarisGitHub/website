package com.polaris.he.website.arrange.service;

import com.polaris.he.website.arrange.entity.ScheduledResult;
import com.polaris.he.website.arrange.entity.School;

import java.util.List;

/**
 * User: hexie
 * Date: 2018/6/4 23:34
 * Description:
 */
public interface ArrangeService {

    /**
     * 根据起始时间和学生进行排班
     *
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