import Cars.CarList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Car.Car;
import Cars.Cars;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarListTest {

  @Test
  @DisplayName("올바른 값이 들어갔을 때 객체 생성")
  void 객체생성1(){
    String input = "jun,han";
    CarList carList = new CarList(input);
    List<Car> expected = Arrays.asList(new Car("jun"), new Car("han"));
    assertThat(carList.getCarList()).containsExactlyInAnyOrderElementsOf(expected);
  }

  @Test
  @DisplayName("자동차의 이름이 5자리 보다 클 때 객체 생성")
  void 객체생성2(){
    String input = "jun,hanjunju";
    assertThrows(IllegalArgumentException.class, () -> {
      new CarList(input);
    });
  }

  @Test
  @DisplayName("자동차의 이름이 빈 값으로 들어갈 때 객체 생성")
  void 객체생성3(){
    String input ="     ";
    assertThrows(IllegalArgumentException.class, () -> {
      new CarList(input);
    });
  }

  @Test
  @DisplayName("getWinnerScoreCar메서드 테스트")
  void getWinnerScoreCar_test(){
    CarList carlist = new CarList(Arrays.asList(new Car("jun", "14"), new Car("han", "9")));
    assertThat(carlist.getWinnerScoreCar()).isEqualTo(new Car("jun", "14"));
  }

  @Test
  @DisplayName("generateRaceFinalWinner 메서드 테스트")
  void generateRaceFinalWinner_test(){
    CarList carList = new CarList(Arrays.asList(new Car("jun", "10"), new Car("han", "12"), new Car("kim", "12")));
    List<Car> expected = Arrays.asList(new Car("han", "12"), new Car("kim", "12"));
    assertThat(carList.generateRaceFinalWinner()).isEqualTo(expected);
  }
}
