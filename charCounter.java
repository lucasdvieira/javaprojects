import java.util.Scanner;
class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string. ");
    String userInputString = input.next();
    System.out.println("Please enter a character. ");
    char userInputChar = input.next(".").charAt(0);
    System.out.println(count(userInputString, userInputChar));

  }
  public static int count(String str, char a){
    int index2nd = 1;
    int index1st = 0;
    int empty = 0;

    if (str.length() == empty){
      return 0;
    }
    
    else if (str.charAt(index1st) == a){

      return 1 + count(str.substring(index2nd), a);
    }

    else {
      return count(str.substring(index2nd), a);
    }
  }
}