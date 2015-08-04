package com.twu.biblioteca.model;

import com.twu.biblioteca.view.*;

import java.util.ArrayList;

public class Library {
    private ArrayList<IRentableType> availableList;
    private ArrayList<IRentableType> checkoutList;
    private ArrayList<IssueDetail> issuedItemList;


    public ArrayList<IRentableType> getAvailableList() {
        return availableList;
    }

    public ArrayList<IRentableType> getCheckoutList() {
        return checkoutList;
    }

    public Library(ArrayList<IRentableType> availableList, ArrayList<IRentableType> checkoutList) {
        this.availableList = availableList;
        this.checkoutList = checkoutList;
        issuedItemList = new ArrayList<IssueDetail>();
    }


    public int exit() {
        return 1;
    }


    public void checkoutItem(String bookName, RentableType type, User user) {
        IView viewCheckout = new ViewCheckout(type);
        IView notCheckout = new ViewNotCheckout(type);
        boolean checkout = false;
        IssueDetail issueDetail;
        for (int i = 0; i < availableList.size(); i++) {
            IRentableType item =  availableList.get(i);
            if (item.isAvilable(bookName) && item.isSameType(type)){
                availableList.remove(i);
                checkoutList.add(item);
                issueDetail = new IssueDetail(item, user);
                issuedItemList.add(issueDetail);
                viewCheckout.show();
                checkout = true;
            }

        }
        if (!checkout)
            notCheckout.show();
    }
    public void returnItem(String bookName, RentableType type) {
        IView returnItem = new ViewReturn(type);
        IView notReturnItem = new ViewNotReturn(type);
        boolean bookReturned = false;
        for (int i = 0; i < checkoutList.size(); i++) {
            IRentableType item = checkoutList.get(i);
            if (item.isAvilable(bookName) && item.isSameType(type)){
                checkoutList.remove(i);
                availableList.add(item);

                returnItem.show();
                bookReturned = true;
            }

        }
        if (!bookReturned)
            notReturnItem.show();
    }

    public ArrayList<IssueDetail> getIssuedItemList() {
        return issuedItemList;
    }

    public IssueDetail getIssueDetail(String name) {
        for (int i = 0; i < issuedItemList.size(); i++) {
            IssueDetail issueDetail = issuedItemList.get(i);
            if (issueDetail.isEqual(name))
                return issueDetail;
        }
        return null;
    }
}
