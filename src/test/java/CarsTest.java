import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import Car.Car;
import Cars.Cars;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

  @Test
  @DisplayName("올바른 값이 들어갈 때 객체 생성")
  void 객체생성(){
    String input = "jun,han";
    Cars cars = new Cars(input);
    Cars expected = new Cars(Arrays.asList(new Car("jun"), new Car("han")));
    assertThat(cars).isEqualTo(expected);
  }
}
