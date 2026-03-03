package org.example;

public class Car {
  String model;
  Engine engine = new Engine();

  Car(String model){
      this.model = model;
  }

  void move(int distance){
      this.engine.durability -= (distance/1000) * 10;
  }

  void showEngine(){
      System.out.printf("Состояние двигателя %s: %d\n", this.model, this.engine.durability);
  }

}
