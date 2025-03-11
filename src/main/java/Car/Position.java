package Car;

import Validator.PositionValidator;

public class Position {
  private int position;
  private static final PositionValidator validator = new PositionValidator();

  public Position(){
    new Position("0");
  }

  public Position(String num){
    validator.isValid(num);
    position = Integer.parseInt(num);
  }

  public static Position create(String num){
    return new Position(num);
  }


  public int getPosition(){
    return position;
  }
}
