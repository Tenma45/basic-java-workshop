package com.example.hellorest.users;

import java.util.List;

public class Users {
    public Users(List<UserModel> users) {
        this.users = users;
    }

    private List<UserModel> users;

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }
}
