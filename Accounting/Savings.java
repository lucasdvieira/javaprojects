public class Savings extends Account {
  private double totalSavings;
  public Savings(){}
  public Savings(double totalSavings){
    
    totalSavings = totalSavings;
  }
  public void setSavings(int save){
    totalSavings = save;
  }
  public double getSavings(){
    return totalSavings;
  }
  
}