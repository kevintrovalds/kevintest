package com.itcast.Service;

import com.itcast.domain.Account;

import java.util.List;

/**
 *账户的业务层接口
 */
public interface AccountService {

    /**
     * 保存用户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 查询所以账户
     * @return
     */
   List<Account> findAll();

    /**
     * 删除账户
     */
   void deleteAccountById(int id);
}
