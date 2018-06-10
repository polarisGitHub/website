package com.polaris.he.website.arrange.service.impl;

import com.polaris.he.website.arrange.entity.ArrangedDepartment;
import com.polaris.he.website.arrange.entity.Department;
import com.polaris.he.website.arrange.entity.ScheduledResult;
import com.polaris.he.website.arrange.entity.School;
import com.polaris.he.website.arrange.service.ArrangeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * User: hexie
 * Date: 2018/6/5 22:45
 * Description:
 */
@Slf4j
public class ScheduleServiceImpl implements ArrangeService {

    @Override
    public ScheduledResult execute(List<School> schools) {
        // 最终排班排到学生上
        if (CollectionUtils.isEmpty(schools)) {
            log.info("学校为空，无法排班");
            return null;
        }

        List<ArrangedDepartment> arrange = new LinkedList<>();
        // TODO 科室应该有个最多人数，不然来一个学校，我在一轮全部安排了
        for (School school : schools) {// 选择一个学校
            log.info("{}开始排班，起始时间：{}", school.getName(), school.getBegin(), school.getEnd());
            for (Map.Entry<Department, Period> entrySet : school.getDepartment().entrySet()) {
                Department department = entrySet.getKey();// 科室
                Period period = entrySet.getValue();// 实习时长
                // 这个科室可以接收这个学校的时间
                LocalDate receiveBeginDate = null;// TODO
                LocalDate receiveEndDate = receiveBeginDate.plus(period);
                // 填充信息
                arrange.add(new ArrangedDepartment(department, school, receiveBeginDate, receiveEndDate));
            }
        }

        // TODO 根据arrange计算排班
        return null;
    }

    @Override
    public ScheduledResult execute(ScheduledResult detail) {
        throw new UnsupportedOperationException();
    }
}