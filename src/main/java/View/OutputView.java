package View;

import Cars.dto.CarInfoList;
import Cars.dto.RaceFinalWinner;
import Io.Writer;

public class OutputView {
  public static final String REPEAT_CHAR = "-";

  public static void printWriteCarNames() {
    Writer.writeLine("Write Car Names");
  }

  public static void printWriteTryNumber() {
    Writer.writeLine("Write TryNumber");
  }

  public void printRoundResult(CarInfoList carinfoList) {
    carinfoList.getMessage();
  }

  public void printWinner(RaceFinalWinner winnerList) {
    winnerList.getMessage();
  }
}
