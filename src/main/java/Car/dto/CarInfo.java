package Car.dto;

import Car.CarName;
import Car.Position;
import View.OutputView;
import utils.StringRepeater;

public record CarInfo(CarName name, Position position){

  public String getMessage(){
    return String.format("%s : %s", name.getName(), StringRepeater.repeat(position.getPosition(), OutputView.REPEAT_CHAR));
  }
}
