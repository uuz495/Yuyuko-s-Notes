class Car {
   String carName;
   int carAge;
   int carColor;
   class Engine {
      String engineName;
      int engineAge;
   }
}
public class Practice {
   public static void main(String[]args) {
      Car.Engine e = new Car().new Engine();
      Car c = new Car();
      
   }
}
