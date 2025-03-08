import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

  @Test
  void 이동(){
    Car car1 = new Car("junyeong");
  }

  @Test
  void 나의_현재_이동거리(){
    Car jun = new Car("jun", 3);
    assertThat(jun.getUserScoreString()).isEqualTo("jun:---");
  }

}
