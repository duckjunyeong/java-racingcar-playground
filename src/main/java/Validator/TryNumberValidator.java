package Validator;

import Constant.Err;

public class TryNumberValidator {

  public static boolean isValid(String tryNumber) {
    String str = tryNumber.trim();
    if ( Integer.parseInt(str) <= 0 ){
      throw new IllegalArgumentException(Err.NEGATIVE_NUMBER.getMessage());
    }
    return true;
  }
}
