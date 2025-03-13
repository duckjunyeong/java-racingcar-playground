package Controller;

import Cars.dto.CarInfoList;
import Cars.dto.RaceFinalWinner;
import View.InputView;
import View.OutputView;
import Cars.Cars;

public class Game {
  private static final InputView inputView = new InputView();
  private static final OutputView outputView = new OutputView();

  public void playGame(){
    Cars cars = inputView.readCarNames();
    TryNumber tryNumber = inputView.readTryNumbers();
    while (!tryNumber.isZero()){
      playOneRound(cars);
      tryNumber.decrease();
      oneRoundResult(cars);
    }
    getGameResult(cars);
  }

  private void getGameResult(Cars cars) {
    RaceFinalWinner winners = cars.getRaceFinalWinner();
    outputView.printWinner(winners);
  }

  private void oneRoundResult(Cars cars) {
    CarInfoList carInfoList = cars.getCarsInfoList();
    outputView.printRoundResult(carInfoList);
  }

  private void playOneRound(Cars cars) {
    cars.moveAllCars();
  }
}
