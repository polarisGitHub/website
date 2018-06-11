package com.polaris.he.website.arrange.service.impl;

import com.polaris.he.website.arrange.entity.*;
import com.polaris.he.website.arrange.holder.ArrangedDataHolder;
import com.polaris.he.website.arrange.service.ArrangeService;
import com.polaris.he.website.arrange.utils.ArrangeDataUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.time.Period;
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
    public List<Arranged> execute(List<School> schools, ArrangeConfig config) {
        // 最终排班排到学生上
        if (CollectionUtils.isEmpty(schools)) {
            log.info("学校为空，无法排班");
            return null;
        }

        ArrangedDataHolder holder = new ArrangedDataHolder();
        for (School school : schools) {// 选择一个学校
            int studentCnt = school.getStudents().size();
            log.info("{}开始排班,有学生{}人，起始时间：{}，结束时间:{}", school.getName(), studentCnt, school.getBegin(), school.getEnd());
            if (studentCnt == 0) {
                continue;
            }
            // 这个学校要实习哪些科室
            for (Map.Entry<Department, Period> entrySet : school.getDepartment().entrySet()) {
                Department department = entrySet.getKey();// 科室
                Period period = entrySet.getValue();// 实习时长
                LocalDate receiveBeginDate = null;// 这个科室开始实习的时间
                LocalDate receiveEndDate = receiveBeginDate.plus(period);// 这个科室结束实习的时间
                List<Student> students = school.getStudents();
                // 安排学生
                while (receiveEndDate.isBefore(receiveBeginDate)) {
                    LocalDate currentDate = LocalDate.from(receiveBeginDate);
                    LocalDate endDate = LocalDate.from(receiveBeginDate).plus(config.getMinimumArrangeInterval());
                    for (Student student : students) {
                        if (ArrangeDataUtils.isStudentFree(holder, student, department, currentDate)) {
                            holder.put(new Arranged(department, school, student, currentDate, endDate));
                        }
                    }
                    receiveBeginDate.plus(config.getMinimumArrangeInterval());
                }
            }
        }
        return holder.get();
    }
}