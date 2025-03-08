import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatorTest {

  @Test
  void 자동차이름_확인(){
    String userInput = "jun,kim,min";
    assertThat(Validator.checkCarName(userInput, ",")).isTrue();
  }

  @Test
  void 시도횟수_확인(){
    String userInput = "-4";
    assertThrows(IllegalArgumentException.class, () -> {
      Validator.checkTryNumber(userInput);
    });
  }
}
