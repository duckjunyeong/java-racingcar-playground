import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarGamTest {

  @Test
  void 게임시작(){
    Car jun = new Car("jun");
    Car min = new Car("min");
    Car kim = new Car("kim");
    Players players = new Players(Arrays.asList(jun, min, kim));
    TryNumber tryNumber = new TryNumber(4);
    CarGame carGame = new CarGame(players, tryNumber);
    carGame.startGame(() -> true);
    WinnerList result = carGame.getResult();
    List<Car> expectedList = Arrays.asList(new Car("jun", 4), new Car("min", 4), new Car("kim", 4));
    WinnerList expected = new WinnerList(expectedList);

    assertThat(result).isEqualTo(expected);
  }
}
