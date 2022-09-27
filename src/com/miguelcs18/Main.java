package com.miguelcs18;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addNewBranch("Tazmania");

        bank.addCustomer("Tazmania", "Mike",50.05);
        bank.addCustomer("Tazmania","Pau", 175.34);
        bank.addCustomer("Tazmania","Nat", 220.12);

        bank.addNewBranch("Sydney");
        bank.addCustomer("Sydney", "Gab", 150.54);

        bank.addTransaction("Tazmania","Mike", 42.22);
        bank.addTransaction("Tazmania","Mike",12.44);
        bank.addTransaction("Tazmania","Pau",1.65);

        bank.showCustomers("Tazmania",true);
        bank.showCustomers("Sydney",true);

        bank.addNewBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Bet", 5.53))
        {
            System.out.println("Error Melbourne branch does not exists!");
        }

        if(!bank.addNewBranch("Tazmania"))
        {
            System.out.printf("Tazmania branch already exists!");
        }
    }
}
