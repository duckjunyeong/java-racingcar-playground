import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import Car.Car;
import Car.CarName;
import Car.Position;


public class CarTest {

  @Test
  @DisplayName("올바른 값이 들어갔을 때 Car객체 생성")
  void 객체생성1() {
    Car jun = new Car("jun", "2");

    assertThat(jun.getName()).isEqualTo(new CarName("jun"));
    assertThat(jun.getPosition()).isEqualTo(new Position("2"));
  }

  @Test
  @DisplayName("제한된 길이를 넘은 문자열이 들어갔을 때 예외를 발생시킨다.")
  void 객체생성2() {
    assertThrows(IllegalArgumentException.class, () -> {
      Car jun = new Car("junjunjun", "2");
    });
  }

  @Test
  @DisplayName("음수의 값이 들어갔을 때 예외를 발생시킨다.")
  void 객체생성3() {
    assertThrows(IllegalArgumentException.class, () -> {
      Car jun = new Car("jun", "-2");
    });
  }

  @Test
  @DisplayName("move함수 테스트, 숫자가 4이상이면 움직인다.")
  void Move함수테스트1(){
    Car jun = new Car("jun"){
      @Override
      protected int generateRandomNumber(int start, int end){
        return 4;
      }
    };
    jun.move();
    assertThat(jun.getPosition()).isEqualTo(new Position("1"));
  }

  @Test
  @DisplayName("move함수 테스트, 숫자가 4미만이면 움직이지 않는다.")
  void Move함수테스트2(){
    Car jun = new Car("jun"){
      @Override
      protected int generateRandomNumber(int start, int end){
        return 3;
      }
    };
    jun.move();
    assertThat(jun.getPosition()).isEqualTo(new Position("0"));
  }
}