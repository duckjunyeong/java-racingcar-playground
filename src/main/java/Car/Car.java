package Car;

import java.util.Objects;
import java.util.Random;

public class Car {
  private static final int MINIMUM_MOVEMENT_NUM = 4;
  private CarName carName;
  private Position position;

  public Car(String carName, String position){
    this.carName = new CarName(carName);
    this.position = new Position(position);
  }

  public Car(String carName){
    this(carName, "0");
  }

  public CarName getName(){
    return carName;
  }

  public Position getPosition(){
    return position;
  }

  public void move() {
    int randomNumber = generateRandomNumber(1, 9);
    if (randomNumber >= MINIMUM_MOVEMENT_NUM){
      position.increase();
    }
  }

  protected int generateRandomNumber(int start, int end) {
    Random random = new Random();
    return random.nextInt(end - start + 1) + start;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return Objects.equals(carName, car.carName) && Objects.equals(position, car.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carName, position);
  }
}
