package Validator;

import Constant.Err;

public class TryNumberValidator {

  public boolean isValid(String tryNumber) {
    if ( Integer.parseInt(tryNumber) <= 0 ){
      throw new IllegalArgumentException(Err.NEGATIVE_NUMBER.getMessage());
    }
    return true;
  }
}
