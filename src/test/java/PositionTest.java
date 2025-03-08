import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PositionTest {

  @Test
  void 포지션증가(){
    Position position = new Position();
    position.increase(3);

    assertThat(position).isEqualTo(new Position(3));
  }
}
