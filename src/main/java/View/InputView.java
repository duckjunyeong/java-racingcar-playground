package View;

import Controller.TryNumber;
import Io.Reader;
import Cars.Cars;

public class InputView {

  public Cars readCarNames(){
    OutputView.printWriteCarNames();
    String input = Reader.readLine();
    return new Cars(input);
  }

  public TryNumber readTryNumbers(){
    OutputView.printWriteTryNumber();
    String input = Reader.readLine();
    return new TryNumber(input);
  }
}
