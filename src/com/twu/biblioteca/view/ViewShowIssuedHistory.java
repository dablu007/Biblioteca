package com.twu.biblioteca.view;

import com.twu.biblioteca.model.IssueDetail;
import com.twu.biblioteca.model.User;

public class ViewShowIssuedHistory implements IView {
    private IssueDetail issueDetail;
    private String name;

    public ViewShowIssuedHistory(IssueDetail issueDetail, String name) {
        this.issueDetail = issueDetail;
        this.name = name;
    }


    @Override
    public void show() {
        User user = new User("dablu", "123456", "123456789", "user", "user");
        user = issueDetail.getUser();
        System.out.println("------------------------------Issued List--------------------------");
        System.out.println(String.format("%17s%27s", "User Name", "Item Issued"));
        System.out.println(String.format("%17s%27s", user.getUserName(), name));

    }
}
