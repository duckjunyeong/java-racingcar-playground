import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import utils.StringConvert;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringConvertTest {

  @Test
  @DisplayName("문자열과 구분자를 주면 List로 변환해준다.")
  void 문자열변환(){
    String input = "jun,kim";
    StringConvert stringConvert = new StringConvert();
    List<String> list = stringConvert.toList(input, ",");
    assertThat(list).isEqualTo(Arrays.asList("jun","kim"));
  }
}
