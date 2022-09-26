package com.miguelcs18;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }


    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public boolean addNewCustomer(String customerName, double initialAmount)
    {
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double transactionAmount)
    {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null)
        {
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }
}
