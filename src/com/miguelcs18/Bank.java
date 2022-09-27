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
    public boolean addCustomer(String branchName, String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addTransaction(String branchName, String customerName, double amount)
    {
        Branch branch =  findBranch(branchName);
        if(branch != null)
        {
            return branch.addTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName)
    {
        for(int i=0; i<this.branches.size(); i++)
        {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(checkedBranch))
            {
                return checkedBranch;
            }
        }
        return null;
    }
    public void showCustomers()
    {

    }
}
