import java.util.Date;

public class Account{
  private int accountNumber = 0; 
  private double balance = 0.0;
  private double annualRate = 0.0;
  private java.util.Date dateCreated;

  public Account(){}
  public Account(int accountNumber, double balance, double annualRate){
    accountNumber = accountNumber;
    balance = balance;
    annualRate = annualRate;
    dateCreated = new java.util.Date();
  }
  // setter
  public void accountNumberSet(int accountNumber){
    accountNumber = accountNumber;
  }
  // getter
  public int accountNumberGet(){
    return accountNumber;
  }

  public void balanceSet(double balance){
    balance = balance;
  }
  
  public double balanceGet(){
    return balance;
  }

  public void annualRateSet(double annualRate){
    annualRate = annualRate;
  }
  
  public double annualRateGet(){
    return annualRate;
  }

}