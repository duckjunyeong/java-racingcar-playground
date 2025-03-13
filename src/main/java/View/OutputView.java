package View;

import Cars.dto.CarInfoList;
import Cars.dto.RaceFinalWinner;

public class OutputView {
  public static final String REPEAT_CHAR = "-";

  public void printRoundResult(CarInfoList carinfoList) {
    carinfoList.getMessage();
  }

  public void printWinner(RaceFinalWinner winnerList) {
    winnerList.getMessage();
  }
}
