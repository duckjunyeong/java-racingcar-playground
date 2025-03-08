import java.util.Objects;

public class Position {
  private int position;

  public Position(){
    position = 0;
  }

  public Position(int num){
    position = num;
  }

  public void increase(int num){
    this.position += num;
  }

  public void increase(){
    position++;
  }

  public boolean biggerThan(Position winnerScore) {
    return position > winnerScore.position;
  }

  public boolean isMatch(Position winnerScore) {
    return position == winnerScore.position;
  }

  public String repeatCharacter(String repeatChar) {
    StringBuilder strbuilder = new StringBuilder();
    for (int i = 0; i < position; i++){
      strbuilder.append(repeatChar);
    }
    return strbuilder.toString();
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (!(obj instanceof Position)) return false;
    Position pos = (Position) obj;
    return position == pos.position;
  }
}
