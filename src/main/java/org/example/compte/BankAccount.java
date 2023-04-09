package org.example.compte;

public class BankAccount {

     private int accountNum;
     private double sold;

     private String owner;



     public BankAccount(int accountNum,  String owner){
          this.accountNum = accountNum;
          this.sold = 0;
          this.owner = owner;
     }


     public void deposit( int amount){
           sold = sold +  amount;
     }

     public void withdrawMoney(int amount){
          sold = sold - amount;
     }

     public void DisplayAccount(){
          System.out.println( " le compte : " + accountNum + " de monsieur "+ owner + " a un solde de : " + sold + " euros");
     }

     @Override
     public String toString() {
          return "BankAccount{" +
                  "accountNum=" + accountNum +
                  ", sold=" + sold +
                  ", owner='" + owner + '\'' +
                  '}';
     }
}
