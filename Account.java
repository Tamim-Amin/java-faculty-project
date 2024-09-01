/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3;
//Fig;3.8
public class Account {
    private String name; // instance variable 
    private double balance; // instance variable

    // Account constructor that receives two parameters 
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name
        
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) {
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    } 

    // method that returns the name
    public String getName() {
        return name; // give value of name back to caller
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) { 
        if (depositAmount > 0.0) { // if the depositAmount is valid 
            balance = balance + depositAmount; // add it to the balance
        }
    }

    // method returns the account balance
    public double getBalance() { 
        return balance; 
    }
}


