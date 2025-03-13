package Cars;

import Car.Car;
import Validator.CarNameValidator;
import utils.StringConvert;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import Car.CarName;
import Car.Position;

public class CarList {

  private List<Car> carList;

  public CarList(String carString){
    this.carList = initCarList(carString);
  }

  public CarList(List<Car> list){
    this.carList = list;
  }


  public void moveCars() {
    carList.stream()
        .forEach(Car::move);
  }

  private List<Car> initCarList(String carString) {
    return StringConvert.toList(carString, ",")
        .stream()
        .filter(CarNameValidator::isValid)
        .map(Car::new)
        .collect(Collectors.toList());
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

