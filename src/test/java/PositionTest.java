import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import Car.Position;

public class PositionTest {

  @Test
  @DisplayName("유효한 값이 들어갔을 때 객체생성")
  void 객체생성1(){
    String input = "3";
    Position position = Position.create(input);
    assertThat(position.getPosition()).isEqualTo(3);
  }

  @Test
  @DisplayName("음수값이 들어갔을 때 객체생성")
  void 객체생성2(){
    String input = "-3";
    assertThrows(IllegalArgumentException.class, () -> {
      Position position = Position.create(input);
    });
  }

  @Test
  @DisplayName("0이 들어갔을 때 객체생성")
  void 객체생성3(){
    String input = "0";
    assertThrows(IllegalArgumentException.class, () -> {
      Position position = Position.create(input);
    });
  }
}
