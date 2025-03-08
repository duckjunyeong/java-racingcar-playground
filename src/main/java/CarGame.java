import jdk.jfr.internal.util.Output;

import java.util.List;

public class CarGame {

  private final Players players;
  private TryNumber tryNumber;
  private WinnerList winnerList;
  private InputView inputView;
  private OutputView outputView;
  private final static Referee referee = new Referee();

  public CarGame(Players players, TryNumber tryNumber){
    this.players = players;
    this.tryNumber = tryNumber;
    this.winnerList = new WinnerList();
  }

  public CarGame(){
    this.players = new Players();
    this.winnerList = new WinnerList();
    this.inputView = new InputView();
    this.outputView = new OutputView();
  }

  public void startGame(MoveStrategy moveStrategy) {
    getCars();
    getTryCnt();
    while (!tryNumber.isZero()){
      round(moveStrategy);
    }
    endGame();
  }

  private void endGame() {
    getResult();
    outputView.printWinnerList(winnerList);
  }

  private void round(MoveStrategy moveStrategy) {
    players.playRound(moveStrategy);
    outputView.printRoundResult(players);
    tryNumber.decrease();
  }

  private void getTryCnt() {
    outputView.printWriteCarName();
    String tryCnt = inputView.readTryCnt();
    enrollTryCnt(tryCnt);
  }

  private void getCars() {
    outputView.printWriteCarName();
    List<String> carList = inputView.readCarName();
    enrollPlayers(carList);
  }

  private void enrollTryCnt(String tryCnt) {
    tryNumber = new TryNumber(Integer.parseInt(tryCnt));
  }

  private void enrollPlayers(List<String> carList) {
    for (String car: carList){
      players.add(car);
    }
  }

  public WinnerList getResult() {
    this.winnerList = referee.getWinner(players);
    return winnerList;
  }
}
