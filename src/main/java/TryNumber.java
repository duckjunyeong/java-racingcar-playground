public class TryNumber {
  private int tryNumber;

  public TryNumber(){
    tryNumber = 0;
  }

  public TryNumber(int tryNumber){
    this.tryNumber = tryNumber;
  }

  public boolean isZero() {
    return tryNumber == 0;
  }

  public void decrease() {
    tryNumber--;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || !(obj instanceof TryNumber)) return false;
    TryNumber tryNumber = (TryNumber) obj;
    return this.tryNumber == tryNumber.tryNumber;
  }
}
