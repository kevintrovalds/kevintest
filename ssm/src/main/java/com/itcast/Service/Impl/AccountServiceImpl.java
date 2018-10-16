package com.itcast.Service.Impl;


import com.itcast.Dao.AccountDao;
import com.itcast.Service.AccountService;
import com.itcast.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);


    }

    public List<Account> findAll() {

                return accountDao.findAll();
    }

    public void deleteAccountById(int id) {
        accountDao.deleteAccountById(id);
    }


}
