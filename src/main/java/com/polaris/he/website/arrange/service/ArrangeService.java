package com.polaris.he.website.arrange.service;

import com.polaris.he.website.arrange.entity.ArrangeConfig;
import com.polaris.he.website.arrange.entity.Arranged;
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
    List<Arranged> execute(List<School> students, ArrangeConfig config);

}