import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.StringRepeater;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringRepeaterTest {

  @Test
  @DisplayName("정수만큼 string을 만들어 내는가")
  void repeat_test(){
    assertThat(StringRepeater.repeat(4, "-")).isEqualTo("----");
  }
}
