import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Players {

  public List<Car> players;

  public Players(){
    players = new ArrayList<>();
  }

  public Players(List<Car> players){
    this.players = players;
  }

  public void playRound(MoveStrategy moveStrategy) {
    for (Car car : players){
      car.move(moveStrategy);
    }
  }

  public Position getWinnerScore() {
    Position winnerScore = new Position(1);
    for (Car car : players){
      winnerScore = car.getWinnerScore(winnerScore);
    }
    return winnerScore;
  }

  public WinnerList getWinnerList(Position winnerScore) {
    WinnerList winnerList = new WinnerList();
    for (Car car : players){
      if (car.isWinnerScore(winnerScore)){
        winnerList.add(car);
      }
    }
    return winnerList;
  }

  public String getPlayRoundResultString(){
    StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < players.size(); i++){
      Car car = players.get(i);
      strBuilder.append(car.getUserScoreString());
      strBuilder.append("\n");
    }
    return strBuilder.toString();
  }

  public void add(String carName){
    players.add(new Car(carName));
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || !(obj instanceof Players)) return false;
    Players players = (Players) obj;
    return Objects.equals(this.players, players.players);
  }

}
