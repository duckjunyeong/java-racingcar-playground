package Car;

import Validator.CarNameValidator;

public class CarName {
  private String name;
  private final CarNameValidator validator = new CarNameValidator();

  public CarName(String name){
    validator.isValid(name);
    this.name = name;
  }

  public String getName(){
    return name;
  }

  @Override
  public boolean equals(Object obj){
    if (obj == this) return true;
    if (obj == null || !(obj instanceof CarName)) return false;
    CarName carName = (CarName) obj;
    return carName.getName() == this.getName();
  }
}
