package com.itcast.dao;


import com.itcast.domain.Item;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ItemDao {

    @Select("select * from `items` ")
    List<Item> findAll();

}
