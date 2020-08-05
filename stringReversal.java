import java.util.Scanner;

class Ex2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string to reverse: ");
    String userInput = input.next();
    reverseDisplay(userInput);

  }
  public static void reverseDisplay(String value){
    
    if (value.length() == 0){
      
      System.out.println(value); 
    }
    else {

       System.out.print(value.charAt(value.length()-1));

       reverseDisplay(value.substring(0,value.length()-1));
    }
  }
}
