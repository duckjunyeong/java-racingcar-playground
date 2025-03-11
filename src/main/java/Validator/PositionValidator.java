package Validator;

import Constant.Err;

public class PositionValidator {

  public boolean isValid(int num) {
    if (num < 0) {
      throw new IllegalArgumentException(Err.NEGATIVE_NUM.getMessage());
    }
    return true;
  }

  public boolean isValid(String num) {
    return isValid(Integer.parseInt(num));
  }

}
