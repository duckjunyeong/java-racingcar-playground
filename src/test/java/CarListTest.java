import Cars.CarList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import Car.Car;
import static org.assertj.core.api.Assertions.*;
public class CarListTest {

  @Test
  @DisplayName("올바른 값이 들어갔을 때 객체 생성")
  void 객체생성1(){
    String input = "jun,han";
    CarList carList = new CarList(input);
    List<Car> expected = Arrays.asList(new Car("jun"), new Car("han"));
    carList.printAllelement();
    assertThat(carList.getCarList()).containsExactlyInAnyOrderElementsOf(expected);
  }
}
