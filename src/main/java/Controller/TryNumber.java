package Controller;

import Validator.TryNumberValidator;

import java.util.Objects;

public class TryNumber {

  private int tryNumber;

  public TryNumber(String str){
    String tryNumber = str.trim();
    TryNumberValidator.isValid(tryNumber);
    this.tryNumber = Integer.parseInt(tryNumber);
  }

  public void decrease() {
    --tryNumber;
  }

  public boolean isZero(){
    return tryNumber == 0;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    TryNumber tryNumber1 = (TryNumber) o;
    return tryNumber == tryNumber1.tryNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(tryNumber);
  }
}
