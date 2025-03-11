import Validator.CarNameValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameValidatorTest {
  private CarNameValidator carNameValidator;

  @BeforeEach
  void 객체생성() {
    carNameValidator = new CarNameValidator();
  }

  @Test
  @DisplayName("올바른 자동차 이름이 입력되었을 때")
  void 입력테스트1() {
    String input = "jun";
    assertThat(carNameValidator.isValid(input)).isTrue();
  }

  @Test
  @DisplayName("빈값이 입력되었을 때 예외를 발생시킨다.")
  void 입력테스트2() {
    String input = "     ";
    assertThrows(IllegalArgumentException.class, () -> {
      carNameValidator.isValid(input);
    });
  }

  @Test
  @DisplayName("제한된 문자열의 길이를 넘어선 문자열이 입력되었을 때 예외를 발생시킨다.")
  void 입력_테스트3() {
    String input = "junjkunjun";
    assertThrows(IllegalArgumentException.class, () -> {
      carNameValidator.isValid(input);
    });
  }
}
