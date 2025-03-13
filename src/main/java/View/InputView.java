package View;

import Io.Reader;
import Cars.Cars;

public class InputView {

  public Cars readCarNames(){
    String input = Reader.readLine();
    return new Cars(input);
  }
}
