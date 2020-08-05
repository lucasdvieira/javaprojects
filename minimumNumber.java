import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double[] myList = new double[10];
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter ten numbers: ");
    for(int i = 0; i < myList.length; i++){
      myList[i] = userInput.nextDouble();
    }
    System.out.println("The minimum number is " + getSmallElement(myList));
    

    }
    public static double getSmallElement (double[] list) {
      double min = list[0];
      for(int i = 1; i < list.length;i++){
        if (list[i] < min){
          min = list[i];
        }
      }
      return min;
  }
}