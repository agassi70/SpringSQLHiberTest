package com.springsqlhibertest.controller;

import com.springsqlhibertest.entity.User;
import com.springsqlhibertest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Юрий on 28.03.2015.
 */
@Controller

public class MyController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String listUsers(Model model) {
        List<User> userList = userService.getUsers();
        int end = userList.size()/10 + 1;
        model.addAttribute("endIndex", end);
        model.addAttribute("userList", userList);
        return "listUsers";
    }


    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute("user") User user) {

        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {
        userService.addUser(user);
        return "redirect:/index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {

        userService.deleteUser(id);

        return "redirect:/index";
    }


    @RequestMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {

        model.addAttribute("user", userService.getUser(id));
        return "edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String editUser(@ModelAttribute("user") User user, BindingResult result) {

        userService.updateUser(user);
        return "redirect:/index";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String findUsers(@RequestParam(required= false, defaultValue="***") String string, Model model) {

        model.addAttribute("find", userService.findUser(string));

        return "findUsers";
    }

    @RequestMapping(value = "/pageUser/{pageNumber}")
    public String loadPage(@PathVariable("pageNumber") int pageNumber, Model model) {
        List<User> userList = userService.getUsers();
        int end = userList.size()/10 + 1;
        model.addAttribute("endIndex", end);
        model.addAttribute("userPages", userService.userPage(pageNumber));
        return "paged";
    }


}