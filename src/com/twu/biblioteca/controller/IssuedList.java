package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.IssueDetail;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewShowIssuedHistory;

public class IssuedList implements IOperation {
    private Library library;

    public IssuedList(Library library) {
        this.library = library;
    }

    @Override
    public int execute() {
        Inputs inputs = new Inputs();
        String itemName = inputs.getNameForCheckout();
        IssueDetail issueDetail = library.getIssueDetail(itemName);
        IView viewShowIssuedHistory = new ViewShowIssuedHistory(issueDetail, itemName);
        viewShowIssuedHistory.show();
        return 0;
    }
}
