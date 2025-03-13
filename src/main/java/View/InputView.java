package View;

import Controller.TryNumber;
import Io.Reader;
import Cars.Cars;

public class InputView {

  public Cars readCarNames(){
    String input = Reader.readLine();
    return new Cars(input);
  }

  public TryNumber readTryNumbers(){
    String input = Reader.readLine();
    return new TryNumber(input);
  }
}
