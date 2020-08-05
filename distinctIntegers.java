import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> intList = new ArrayList<Integer>();
    System.out.println("Enter ten integers: ");
    while (intList.size() < 10){
      int userInput = input.nextInt();
      intList.add(userInput);
    }
    
    
    System.out.print("The distinct integers are ");
    removeDuplicate(intList);
  }

  public static void removeDuplicate(ArrayList<Integer> list){
    for (int a = 0; a < list.size(); a++){
      for (int b = a + 1; b < list.size(); b++){
        if (list.get(a).equals(list.get(b))) {
          list.remove(b);
          b--;
        }
      }
    }
    System.out.println(list);

  }
}