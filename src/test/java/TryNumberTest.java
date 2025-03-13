import Controller.TryNumber;
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

  @Test
  @DisplayName("올바른 값을 넣어서 TryNumber객체 생성하기")
  void tryNumber_객체생성(){
    String input = "3     ";
    TryNumber tryNumber = new TryNumber(input);
  }

  @Test
  @DisplayName("음수 값을 넣어서 TryNumber객체 생성하기")
  void tryNumber_객체생성2(){
    String input = "-3";
    assertThrows(IllegalArgumentException.class, () -> {
      new TryNumber(input);
    });
  }

  @Test
  @DisplayName("0을 넣어서 TryNumber객체 생성하기")
  void tryNumber_객체생성3(){
    String input = "0";
    assertThrows(IllegalArgumentException.class, () -> {
      new TryNumber(input);
    });
  }

  @Test
  @DisplayName("띄어쓰기를 넣어서 TryNumber객체 생성하기")
  void tryNumber_객체생성4(){
    String input = "      ";
    assertThrows(IllegalArgumentException.class, () -> {
      new TryNumber(input);
    });
  }

  @Test
  @DisplayName("decrase 함수 테스트")
  void decrease_test(){
    TryNumber tryNumber = new TryNumber("4");
    tryNumber.decrease();
    assertThat(tryNumber).isEqualTo(new TryNumber("3"));
  }
}
