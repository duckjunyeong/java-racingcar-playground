import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OutputViewTest {

  @Test
  void 승자출력(){
    OutputView outputView = new OutputView();

    Car jun = new Car("jun", 5);
    Car min = new Car("min", 5);
    Car kim = new Car("kim", 5);
    Players players = new Players(Arrays.asList(jun, min, kim));
    WinnerList winnerList = players.getWinnerList(players.getWinnerScore());
    assertThat(outputView.translateToStr(winnerList)).isEqualTo("jun, min, kim");
  }

  @Test
  void 최종_승자_출력(){
    OutputView outputView = new OutputView();

    Car jun = new Car("jun", 5);
    Car min = new Car("min", 5);
    Car kim = new Car("kim", 5);
    Players players = new Players(Arrays.asList(jun, min, kim));
    WinnerList winnerList = players.getWinnerList(players.getWinnerScore());
    assertThat(outputView.printWinnerList(winnerList)).isEqualTo("jun, min, kim이 최종 승자입니다.");
  }

  @Test
  void 게임결과_출력(){
    OutputView outputView = new OutputView();

    Car jun = new Car("jun", 5);
    Car min = new Car("min", 5);
    Car kim = new Car("kim", 5);
    Players players = new Players(Arrays.asList(jun, min, kim));

    assertThat(outputView.printRoundResult(players)).isEqualTo("jun:-----\nmin:-----\nkim:-----\n");

  }

}
