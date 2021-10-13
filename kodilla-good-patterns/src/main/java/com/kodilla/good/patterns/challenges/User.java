package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class User {
    private final String loginName;
    private final String firstName;
    private final String lastName;
    private ArrayList<Order> historyOfOrders = new ArrayList<>();

    public User(final String loginName, final String firstName, final String lastName) {
        this.loginName = loginName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void addOrderToUserHistory(Order order) {
        historyOfOrders.add(order);
    }
}
