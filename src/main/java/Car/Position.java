package Car;

import Validator.PositionValidator;

public class Position {
  private int position;
  private static final PositionValidator validator = new PositionValidator();

  public Position(){
    this.position = 0;
  }

  public Position(String num){
    validator.isValid(num);
    position = Integer.parseInt(num);
  }

  public int getPosition(){
    return position;
  }


  @Override
  public boolean equals(Object obj){
    if (obj == this) return true;
    if (obj == null || !(obj instanceof Position)) return false;
    Position pos = (Position) obj;
    return pos.getPosition() == this.position;
  }

  public void increase() {
      ++position;
  }
}
