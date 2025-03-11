package Validator;

import Constant.Err;

public class CarNameValidator {
  private static final int MAX_NAME_LENGTH = 5;

  public boolean isValid(String input) {
    return !isBlank(input) && !isOverLength(input);
  }

  private boolean isBlank(String input){
    if (input.trim().equals("")){
      throw new IllegalArgumentException(Err.EMPTY_STRING.getMessage());
    }
    return false;
  }

  private boolean isOverLength(String input){
    if (input.trim().length() > MAX_NAME_LENGTH){
      throw new IllegalArgumentException(Err.LENGTH_EXCEEDED.getMessage());
    }
    return false;
  }
}
