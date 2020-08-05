public class Checking extends Account {
  private int overDraftLimit;
  public Checking(){}
  
  public void setLimit(int limit){
    overDraftLimit = limit;
  }
  public int getLimit(){
    return overDraftLimit;
  }

}