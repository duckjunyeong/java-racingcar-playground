import Validator.PositionValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PositionValidatorTest {
  private PositionValidator validator;

  @BeforeEach
  void 객체생성(){
    validator = new PositionValidator();
  }

  @Test
  @DisplayName("양의 정수가 들어갔을 때")
  void 입력테스트(){
    int num = 1;
    assertThat(validator.isValid(num)).isTrue();
  }

  @Test
  @DisplayName("음의 정수가 들어갔을 때")
  void 입력테스트2(){
    int num = -1;
    assertThrows(IllegalArgumentException.class, () -> {
      validator.isValid(num);
    });
  }

  @Test
  @DisplayName("0이 들어갔을 때")
  void 입력테스트3(){
    int num = 0;
    assertThrows(IllegalArgumentException.class, () -> {
      validator.isValid(num);
    });
  }

  @Test
  @DisplayName("유효한 문자열이 들어갔을 때")
  void 입력테스트4(){
    String num = "10";
    assertThat(validator.isValid(num)).isTrue();
  }

  @Test
  @DisplayName("유효하지 않는 문자열이 들어갔을 때")
  void 입력테스트5(){
    String num = "-10";
    assertThrows(IllegalArgumentException.class, () -> {
      validator.isValid(num);
    });
  }



  }
