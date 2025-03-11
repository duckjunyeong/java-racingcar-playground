import Car.CarName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

  @Test
  @DisplayName("올바른 자동차 이름이 주어졌을 때 CarName객체를 생성한다.")
  void CarName객체생성1(){
    String input = "jun";
    CarName carName = new CarName(input);
    assertThat(carName.getName()).isEqualTo("jun");
  }

  @Test
  @DisplayName("빈 값이 주어졌을 때 예외를 반환한다.")
  void CarName객체생성2(){
    String input = "     ";
    assertThrows(IllegalArgumentException.class, () -> {
      CarName carName = new CarName(input);
    });
  }

  @Test
  @DisplayName("제한된 문자열길이를 넘어서는 문자열이 주어졌을 때 예외를 반환한다.")
  void CarName객체생성3(){
    String input = "junjunjun";
    assertThrows(IllegalArgumentException.class, () -> {
      CarName carName = new CarName(input);
    });
  }
}
