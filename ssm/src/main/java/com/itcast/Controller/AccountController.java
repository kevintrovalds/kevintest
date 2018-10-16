package com.itcast.Controller;

import com.itcast.Service.AccountService;
import com.itcast.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户。。。");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public void   saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
      accountService.saveAccount(account);
      response.sendRedirect(request.getContextPath()+"/account/findAll");
      return;
    }
    @RequestMapping("/delete")
    public void   deleteAccountById(int id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.deleteAccountById(id);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
