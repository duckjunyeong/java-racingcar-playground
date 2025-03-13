package Cars.dto;

import Car.dto.CarInfo;

import java.util.List;

public record CarInfoList(List<CarInfo> carInfoList) {

  public void getMessage(){
    carInfoList.stream()
        .map(CarInfo::getMessage)
        .forEach(System.out::println);
  }
}
