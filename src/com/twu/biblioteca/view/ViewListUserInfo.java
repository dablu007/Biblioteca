package com.twu.biblioteca.view;

import com.twu.biblioteca.model.User;

public class ViewListUserInfo implements IView {
    private User user;

    public ViewListUserInfo(User user) {
        this.user = user;
    }

    @Override
    public void show() {
        System.out.println("------------------------------User Details--------------------------");
        System.out.println(String.format("%17s%27s%27s", "UserName", "Phone Number", "Library Number"));
        System.out.println(String.format("%15s%29s%25s", user.getUserName(),user.getPhoneNumber(), user.getLibraryNumber()));
        System.out.println("----------------------------------------------------------------------");
    }
}
