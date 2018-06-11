package com.polaris.he.website.arrange.holder;

import com.polaris.he.website.arrange.entity.Arranged;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * User: hexie
 * Date: 2018/6/11 22:33
 * Description:
 */
@NoArgsConstructor
@AllArgsConstructor
public class ArrangedDataHolder {

    private List<Arranged> arranged = new LinkedList<>();

    public void put(Arranged arranged) {
        this.arranged.add(arranged);
    }

    public List<Arranged> get() {
        return arranged;
    }
}