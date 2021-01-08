package lab1;

import java.util.*;

public class BankAccount {
    Random rand = new Random();
    String  name = null;
    int accountNum = rand.nextInt(999);
    double balance = 0.0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        BankAccount acct1 = new BankAccount("Sam");
        BankAccount acct2 = new BankAccount("Obama",100.00);
        acct1.depositFunds(500.00);
        acct2.depositFunds(300.00,3);
        acct1.withdrawFunds(75,1);
        acct2.withdrawFunds(20);
        acct1.displayAccountInfo();
        acct2.displayAccountInfo();

    }

    public BankAccount(String name, double balance){
        this.name = name;
        this.accountNum = accountNum + 1;
        this.balance = balance;

    }
    public BankAccount(String name){
        this.name = name;
        this.accountNum = accountNum + 1;

    }
    public void withdrawFunds(double withdrawnAmt){
         balance -= withdrawnAmt;
    }
    public void withdrawFunds(double withdrawnAmt, double fee){
        balance -= withdrawnAmt-fee;

    }
    public void depositFunds(double depositAmt){
        balance += depositAmt;
        System.out.println("The new balance after deposit is: "+ balance);

    }
    public void depositFunds(double depositAmt, double interest){
        balance += depositAmt;
        balance += ((interest/100)*balance);
        System.out.println("The new balance after deposit and adding interest is: "+ balance);


    }
    public void displayAccountInfo(){
        System.out.println("Account number: "+accountNum);
        System.out.println("Account balance: "+ balance);

    }
}

