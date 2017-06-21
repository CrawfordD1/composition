package example.codeclan.com.composition_starter;

import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  private Flyable ride;
  private Protector minion;

  public Wizard(String name, Flyable ride, Protector minion){
    this.name = name;
    this.ride = ride;
    this.minion = minion;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public String protect(){
    return this.minion.protect();
  }

  public void setRide(Flyable ride) {
    this.ride = ride;
  }

  public void setMinion(Protector minion) {
    this.minion = minion;
  }
}