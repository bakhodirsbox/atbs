package com.atbs.adminUser;

import com.atbs.user.UserItem;

public class AdminUserItem extends UserItem {
    private  String name;
    private  int  capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
