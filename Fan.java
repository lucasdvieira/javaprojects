public class Fan {
   final int SLOW = 1;
   final int MEDIUM = 2;
   final int FAST = 3;

   private int speed = SLOW;
   private boolean on = true;
   private double radius = 5;
   private String color = "blue"; 

   Fan(){

   }

   public int getSpeed(){
     return speed;
   }
   public void setSpeed(int speedSet){
     speed = speedSet;
  } 
  public boolean getPower(){
     return on;
   }
   public void setPower(boolean powerSet){
     on = powerSet;
  } 

  public double getRadius(){
     return radius;
   }
   public void setRadius(double radiusSet){
     radius = radiusSet;
  } 

  public String getColor(){
     return color;
   }
   public void setColor(String colorSet){
     color = colorSet;
  } 

  public void to_String(){
    if (on == true){
      System.out.println("The fan speed is: " + getSpeed());
      System.out.println("The fan color is: " + getColor());
      System.out.println("The fan radius is: " + getRadius());
    }
    else {
      System.out.println("The fan is off");
      System.out.println("The fan color: "+ getColor());
      System.out.println("The fan radius: " + getRadius());
    }
  }
}