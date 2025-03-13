package utils;

public class StringRepeater {


  public static String repeat(int cnt, String character) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < cnt; i++){
      str.append(character);
    }
    return str.toString();
  }
}
