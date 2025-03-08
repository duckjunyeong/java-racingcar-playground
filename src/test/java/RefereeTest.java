import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RefereeTest {

  @Test
  void 승자_점수(){
    Car jun = new Car("jun", 5);
    Car min = new Car("min", 2);
    Car kim = new Car("kim", 1);
    Players players = new Players(Arrays.asList(jun, min, kim));
    Position winnerScore = players.getWinnerScore();
    assertThat(winnerScore).isEqualTo(new Position(5));
  }

  @Test
  void 승자_추출(){
    Car jun = new Car("jun", 5);
    Car min = new Car("min", 5);
    Car kim = new Car("kim", 1);
    Players players = new Players(Arrays.asList(jun, min, kim));

    WinnerList winners = players.getWinnerList(players.getWinnerScore());
    WinnerList expected = new WinnerList(Arrays.asList(new Car("jun", 5), new Car("min", 5)));
    assertThat(winners).isEqualTo(expected);

  }

}
