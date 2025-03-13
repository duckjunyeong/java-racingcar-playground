package Car;

import Validator.PositionValidator;

public class Position implements Comparable<Position> {
  private int position;
  private static final PositionValidator validator = new PositionValidator();

  public Position(){
    this.position = 0;
  }

  public Position(String num){
    validator.isValid(num);
    position = Integer.parseInt(num);
  }

  @Override
  public int compareTo(Position pos1) {
    return Integer.compare(this.position, pos1.position);
  }

  public int getPosition(){
    return position;
  }


  @Override
  public boolean equals(Object obj){
    if (obj == this) return true;
    if (obj == null || !(obj instanceof Position)) return false;
    Position pos = (Position) obj;
    return pos.position == this.position;
  }

  public void increase() {
      ++position;
  }
}
