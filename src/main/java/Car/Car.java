package Car;

public class Car {
  private CarName carName;
  private Position position;

  public Car(String carName, String position){
    this.carName = new CarName(carName);
    this.position = new Position(position);
  }

  public CarName getName(){
    return carName;
  }

  public Position getPosition(){
    return position;
  }
}
