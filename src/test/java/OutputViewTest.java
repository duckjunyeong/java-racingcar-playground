import Car.dto.CarInfo;
import Cars.dto.CarInfoList;
import Cars.dto.RaceFinalWinner;
import View.OutputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Car.Car;

import java.util.Arrays;
import java.util.List;

public class OutputViewTest {

  private final OutputView outputview = new OutputView();

  @Test
  @DisplayName("printRoundResult 메서드 출력확인")
  void printRoundResult_tset(){
    Car jun = new Car("jun", "3");
    Car kim = new Car("kim", "2");

    CarInfo jun_CarInfo = new CarInfo(jun.getName(), jun.getPosition());
    CarInfo kim_CarInfo = new CarInfo(kim.getName(), kim.getPosition());

    List<CarInfo> list = Arrays.asList(jun_CarInfo, kim_CarInfo);
    CarInfoList infoList = new CarInfoList(list);
    outputview.printRoundResult(infoList);
  }

  @Test
  @DisplayName("printWinner 메서드 출력확인")
  void printWinner_test(){
    RaceFinalWinner winner = new RaceFinalWinner(Arrays.asList(new Car("jun"), new Car("han")));
    outputview.printWinner(winner);
  }
}
