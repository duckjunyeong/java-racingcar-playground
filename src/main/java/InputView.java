import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

  public static final Scanner scanner = new Scanner(System.in);

  List<String> readCarName(){
    String userInput = scanner.nextLine();
    Validator.checkCarName(userInput, ",");
    return translateToList(userInput, ",");
  }

  public String readTryCnt() {
    String str = scanner.nextLine();
    Validator.checkTryNumber(str);
    return str;
  }

  private List<String> translateToList(String userInput, String sep) {
    String[] strList = userInput.split(sep);
    List<String> result = new ArrayList<>();
    for (String str: strList){
      result.add(str);
    }
    return result;
}
}
