package Cars;

import Car.Car;
import Car.dto.CarInfo;
import Cars.dto.CarInfoList;
import Cars.dto.RaceFinalWinner;

import java.util.List;
import java.util.Objects;

public class Cars {
  private CarList carList;

  public Cars(String str){
    this.carList = new CarList(str);
  }

  public Cars(List<Car> list){
    this.carList = new CarList(list);
  }


  public void moveAllCars() {
   carList.moveCars();
  }

  public CarInfoList getCarsInfoList(){
    return new CarInfoList(carList.generateCarInfoList());
  }

  public RaceFinalWinner getRaceFinalWinner() {
    return new RaceFinalWinner(carList.generateRaceFinalWinner());
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Cars cars = (Cars) o;
    return Objects.equals(carList, cars.carList);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(carList);
  }

}
