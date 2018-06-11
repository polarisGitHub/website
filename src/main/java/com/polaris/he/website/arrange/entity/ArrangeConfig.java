package com.polaris.he.website.arrange.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Period;

/**
 * User: hexie
 * Date: 2018/6/11 22:40
 * Description:
 */
@Getter
@Setter
@ToString
public class ArrangeConfig {

    // 排班最小间隔
    private Period minimumArrangeInterval;
}