import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserInputTest {


  @Test
  @DisplayName("사용자의 입력이 제대로 들어왔을 때")
  void 사용자의_입력이_제대로_들어왔을_때(){
    String userInput = "pobi,jung,hanbi";
    assertThat(Validator.checkUserInput(userInput)).isTrue();
  }

  @Test
  @DisplayName("오류의 값이 들어왔을 때")
  void 오류의_값이_들어왔을_때(){
    String userInput = "pobi,jusvdxfdfds,hanbi";
    assertThrows(IllegalArgumentException.class, () -> {
        Validator.checkUserInput(userInput);
    });
  }
}
