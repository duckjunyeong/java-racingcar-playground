import java.util.Objects;

public class Car {

  private final String name;
  private Position position;

  public Car(String name){
    this(name, 0);
  }

  public Car(String name, int pos){
    this.name = name;
    position = new Position(pos);
  }

  public void move(MoveStrategy moveStrategy) {
    if (moveStrategy.move()){
      position.increase();
    }
  }
  public Position getWinnerScore(Position winnerScore) {
    if (position.biggerThan(winnerScore)) return position;
    return winnerScore;
  }

  public boolean isWinnerScore(Position winnerScore) {
    return position.isMatch(winnerScore);
  }

  public String getUserScoreString() {
    String userScore = position.repeatCharacter("-");
    StringBuilder userScoreString = new StringBuilder();
    userScoreString.append(name + ":");
    userScoreString.append(userScore);

    return userScoreString.toString();
  }

  public void appendName(StringBuilder str) {
    str.append(name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return Objects.equals(position, car.position) && Objects.equals(name, car.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position);
  }

}
