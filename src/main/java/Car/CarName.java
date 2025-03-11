package Car;

import Validator.CarNameValidator;

public class CarName {
  private String name;
  private final CarNameValidator validator = new CarNameValidator();

  public CarName(String name){
    validator.isValid(name);
    this.name = name;
  }

  public static CarName create(String name){
    return new CarName(name);
  }

  public String getName(){
    return name;
  }
}
