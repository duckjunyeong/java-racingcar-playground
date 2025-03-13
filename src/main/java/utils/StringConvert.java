package utils;

import java.util.Arrays;
import java.util.List;

public class StringConvert {
  public static List<String> toList(String str, String sep) {
    return Arrays.asList(str.split(sep));
  }
}
