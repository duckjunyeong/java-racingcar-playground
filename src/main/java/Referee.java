import java.util.ArrayList;
import java.util.List;

public class Referee {
  public WinnerList getWinner(Players players) {
    return players.getWinnerList(players.getWinnerScore());
  }
}