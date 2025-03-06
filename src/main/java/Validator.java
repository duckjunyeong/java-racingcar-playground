import java.util.List;

public class Validator {

  public static boolean checkUserInput(String userInput) {
    String[] list = userInput.split(",");
    for (String car : list){
     checkCarNameLength(car);
    }
    return true;
  }

  public static boolean checkCarNameLength(String car){
    if (car.length() >= 6){
      throw new IllegalArgumentException("자동차이름은 5자리 이하이어야 합니다.");
    }
    return true;
  }
}
