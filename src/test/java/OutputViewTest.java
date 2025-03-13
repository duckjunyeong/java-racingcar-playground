import Car.dto.CarInfo;
import Cars.dto.CarInfoList;
import View.OutputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Car.Car;

import java.util.Arrays;
import java.util.List;

public class OutputViewTest {

  private final OutputView outputview = new OutputView();

  @Test
  @DisplayName("Dto로 값을 받아서 올바르게 출력되는지 확인")
  void printRoundResult_tset(){
    Car jun = new Car("jun", "3");
    CarInfo jun_CarInfo = new CarInfo(jun.getName(), jun.getPosition());
    Car kim = new Car("kim", "2");
    CarInfo kim_CarInfo = new CarInfo(kim.getName(), kim.getPosition());
    List<CarInfo> list = Arrays.asList(jun_CarInfo, kim_CarInfo);
    CarInfoList infoList = new CarInfoList(list);
    outputview.printRoundResult(infoList);
  }
}
