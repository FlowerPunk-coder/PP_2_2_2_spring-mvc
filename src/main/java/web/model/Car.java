package web.model;


import java.util.ArrayList;
import java.util.List;

public class Car {

   private String model;
   private String color;
   private double power;
   private List<Car> carList;

   public Car() {
      carList = new ArrayList<>();
      carList.add(new Car("Lada", "Баклажан", 1.2));
      carList.add(new Car("WV", "Вишня", 1.4));
      carList.add(new Car("Ford", "Черный", 1.7));
      carList.add(new Car("Opel", "Серебристый", 1.9));
      carList.add(new Car("Dodge", "Синий", 3.2));
   }

   private Car(String model, String color, double power) {
      this.model = model;
      this.color = color;
      this.power = power;
   }

   public List<Car> getCars() {
      return carList;
   }

   public String getModel() {
      return model;
   }

   public String getColor() {
      return color;
   }

   public double getPower() {
      return power;
   }
}
