package com.polaris.he.website.arrange.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * User: hexie
 * Date: 2018/6/4 23:51
 * Description:
 */
@Getter
@Setter
@ToString
public class ScheduledResult {

    private List<ScheduledStudentEntity> result;
}