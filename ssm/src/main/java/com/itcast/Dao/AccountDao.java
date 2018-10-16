package com.itcast.Dao;

import com.itcast.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 持久层接口
 */
public interface AccountDao {
    /**
     * 保存用户
     * @param account
     */

    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    /**
     * 查询所有用户
     * @return
     */
    @Select("SELECT * FROM ACCOUNT")
    List<Account> findAll();

    @Delete("delete  from account where id = #{id}")
   void deleteAccountById(int id);
}
