import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WinnerListTest {

  @Test
  void 승자등록(){
    WinnerList winnerList = new WinnerList();
    Car jun = new Car("jun", 4);
    winnerList.add(jun);

    List<Car> list = Arrays.asList(new Car("jun", 4));
    WinnerList expected = new WinnerList(list);

    assertThat(winnerList).isEqualTo(expected);
  }
}
