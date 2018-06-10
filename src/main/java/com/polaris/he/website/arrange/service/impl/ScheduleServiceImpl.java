package com.polaris.he.website.arrange.service.impl;

import com.polaris.he.website.arrange.entity.ScheduledResult;
import com.polaris.he.website.arrange.entity.School;
import com.polaris.he.website.arrange.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.util.List;

/**
 * User: hexie
 * Date: 2018/6/5 22:45
 * Description:
 */
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public ScheduledResult execute(List<School> schools) {
        // 最终排班排到学生上
        if (CollectionUtils.isEmpty(schools)) {
            log.info("学校为空，无法排班");
            return null;
        }

        for (School school : schools) {
            log.info("{}开始排班，起始时间：{}", school.getName(), school.getBegin());
            LocalDate currentDate = LocalDate.from(school.getBegin());
            LocalDate end = null;// TODO
            while (currentDate.isAfter(end)) {// 开始排班
                currentDate = currentDate.plusWeeks(1);// 加一周
                // 随机选一个

            }
        }

        return null;
    }

    @Override
    public ScheduledResult execute(ScheduledResult detail) {
        throw new UnsupportedOperationException();
    }
}