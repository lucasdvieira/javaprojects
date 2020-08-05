import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a 4-by-4 matrix row by row: ");
    double[][] numMatrix = new double[4][4];
    for (int i = 0; i < numMatrix.length;i++){
      for (int j = 0; j < numMatrix.length; j++){
        numMatrix[i][j] = userInput.nextDouble();
      }
    }
    System.out.println("Sum of the elements in the major diagnol is: " + sumMajorDiagnol(numMatrix));
    
  }
  public static double sumMajorDiagnol(double[][] m) {
      double total = 0;
      for (int a = 0; a < m.length; a++){
        total += m[a][a];
      }
      return total;
    }
}