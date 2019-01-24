package net.wanho.action;


import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class UserAction extends ActionSupport {


    private String name;

    private int id;


    private UserService userService;

    @Override
    public String execute() throws Exception {
        List<User> list = this.userService.selectUsers();
        return "success";
    }

    public String test() throws Exception {
        User user  = this.userService.getUserById(id);
        return "success";
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
