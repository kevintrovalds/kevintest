package com.itcast.service.impl;


import com.itcast.dao.ItemDao;
import com.itcast.domain.Item;
import com.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    public List<Item> findAll() {
        List<Item> list = itemDao.findAll();
        return list;
    }


}
