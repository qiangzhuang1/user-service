package com.demo.userService;

public class LoginServiceImpl implements LoginService {
    @Override
    public String login(String userName, String pwd) {
        if (userName.equals("admin") && pwd.equals("admin")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}