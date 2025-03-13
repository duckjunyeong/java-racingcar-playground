package Validator;

import Constant.Err;

public class CarNameValidator {
  private static final int MAX_NAME_LENGTH = 5;

  public static boolean isValid(String input) {
    return !isBlank(input) && !isOverLength(input);
  }

  private static boolean isBlank(String input){
    if (input.trim().equals("")){
      throw new IllegalArgumentException(Err.EMPTY_STRING.getMessage());
    }
    return false;
  }

  private static boolean isOverLength(String input){
    if (input.trim().length() > MAX_NAME_LENGTH){
      throw new IllegalArgumentException(Err.LENGTH_EXCEEDED.getMessage());
    }
    return false;
  }
}
