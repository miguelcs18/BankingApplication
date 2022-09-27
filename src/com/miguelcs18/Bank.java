package com.miguelcs18;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName)
    {
        if(findBranch(branchName) == null)
        {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }
    private void addCustomer()
    {

    }
    private void addTransaction()
    {

    }
    public void showCustomers()
    {

    }
}
