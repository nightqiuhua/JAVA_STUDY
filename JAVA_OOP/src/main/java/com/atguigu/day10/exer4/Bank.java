package com.atguigu.day10.exer4;

import atguigu.basic.day10.exer4.Customer;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l){
        Customer cust  = new Customer(f,l);
        customers[numberOfCustomers++] = cust;

    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}
