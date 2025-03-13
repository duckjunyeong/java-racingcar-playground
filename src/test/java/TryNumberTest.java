import Validator.TryNumberValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TryNumberTest {
  private static final TryNumberValidator validator = new TryNumberValidator();

  @Test
  @DisplayName("tryNumber을 검증하는 validator테스트")
  void tryNumberValidator_test(){
    String tryNumber = "3";
    assertThat(validator.isValid(tryNumber)).isTrue();
  }

  @Test
  @DisplayName("tryNumber을 검증하는 validator테스트")
  void tryNumberValidator_test2(){
    String tryNumber = "-1";
    assertThrows(IllegalArgumentException.class, () -> {
     validator.isValid(tryNumber);
    });
  }
}
