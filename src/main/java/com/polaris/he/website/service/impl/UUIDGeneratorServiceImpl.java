package com.polaris.he.website.service.impl;

import com.polaris.he.website.service.IDGeneratorService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * User: hexie
 * Date: 2018/6/11 22:58
 * Description:
 */
@Service
public class UUIDGeneratorServiceImpl implements IDGeneratorService<String> {

    @Override
    public String generate() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}