package com.swjd.controller;

import com.swjd.bean.Customer;
import com.swjd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customerController")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //能够跳转到主页面zym,并且带数据
    @RequestMapping("/toZym")
    public String toZym(Model model){
        List<Customer> list=new ArrayList<>();
        list=customerService.getAll();
        model.addAttribute("list",list);
        model.addAttribute("customer",new Customer());
        return "zym";
    }
}
