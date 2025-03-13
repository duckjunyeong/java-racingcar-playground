import Cars.CarList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import Car.Car;
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
}
