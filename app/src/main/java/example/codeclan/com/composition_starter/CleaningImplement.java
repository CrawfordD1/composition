package example.codeclan.com.composition_starter;

public abstract class CleaningImplement{

  String brand;

  public CleaningImplement(String brand) {
    this.brand = brand;
  }

  public String getBrand(){
    return this.brand;
  }
}