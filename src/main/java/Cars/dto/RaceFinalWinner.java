package Cars.dto;

import Car.Car;
import Io.Writer;

import java.util.List;
import java.util.stream.Collectors;

import Car.CarName;

public record RaceFinalWinner(List<Car> winnerList) {

  public void getMessage() {
    String winnerNames = winnerList.stream()
        .map(Car::getName)
        .map(CarName::getName)
        .collect(Collectors.joining(", "));

    Writer.write("Winners ars: " + winnerNames + " nice!!");
  }
}
