import Cars.dto.RaceFinalWinner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import Car.Car;
import Cars.Cars;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTest {

  @Test
  @DisplayName("올바른 값이 들어갈 때 객체 생성")
  void 객체생성(){
    String input = "jun,han";
    Cars cars = new Cars(input);
    Cars expected = new Cars(Arrays.asList(new Car("jun"), new Car("han")));
    assertThat(cars).isEqualTo(expected);
  }

  @Test
  @DisplayName("5자리가 넘는 값이 들어갈 때 객체 생성")
  void 객체생성2(){
    String input = "jun,hannjnj";
    assertThrows(IllegalArgumentException.class, () -> {
      new Cars(input);
    });
  }

  @Test
  @DisplayName("빈 값이 들어갈 때 객체 생성")
  void 객체생성3(){
    String input = "  ";
    assertThrows(IllegalArgumentException.class, () -> {
      new Cars(input);
    });
  }

//  @Test
//  @DisplayName("승자를 올바르게 찾는지 확인")
//  void getRaceFinalWinner_test(){
//    Cars car = new Cars(Arrays.asList(new Car("jun", "5"), new Car("han", "6")));
//    RaceFinalWinner expected = new RaceFinalWinner(Arrays.asList(new Car("han", "6")));
//    assertThat(car.getRaceFinalWinner()).isEqaulTo(expected);
//  }
}
