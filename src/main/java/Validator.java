public class Validator {
  public static boolean checkCarName(String userInput, String sep) {
    String[] carList = userInput.split(sep);
    for (String carName: carList){
      carName = carName.trim();
      isValidCarName(carName);
    }
    return true;
  }

  private static void isValidCarName(String carName) {
    if (carName == "" || carName.length() > 5) throw new IllegalArgumentException("자동차의 이름은 5자리이하만 가능합니다.");
  }

  public static boolean checkTryNumber(String userInput) {
    int tryNumber = Integer.parseInt(userInput);
    isValidTryNumber(tryNumber);
    return true;
  }

  private static void isValidTryNumber(int tryNumber) {
    if (tryNumber < 0) throw new IllegalArgumentException("시도 횟수는 양의 정수이어야합니다.");
  }
}
