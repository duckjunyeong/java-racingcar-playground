package Cars;

import Car.Car;
import Validator.CarListValidator;
import utils.StringConvert;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import Car.CarName;
import Car.Position;

public class CarList {

  private List<Car> carList;

  public CarList(String carString){
    CarListValidator.isValid(carString);
    this.carList = initCarList(carString);
  }

  private List<Car> initCarList(String carString) {
    return StringConvert.toList(carString, ",")
        .stream()
        .map(Car::new)
        .collect(Collectors.toList());
  }
  public void printAllelement(){
    for (Car car:carList){
      CarName name = car.getName();
      Position pos = car.getPosition();
      System.out.println(name.getName() + ", " + pos.getPosition());
    }
  }
  public List<Car> getCarList(){
    return carList;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    CarList carList1 = (CarList) o;
    return Objects.equals(carList, carList1.carList);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(carList);
  }
}

