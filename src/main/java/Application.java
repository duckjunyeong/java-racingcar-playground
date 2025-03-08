public class Application {

  public static void main(String[] args){
    CarGame carGame = new CarGame();
    MoveStrategy randomMoveStrategy = new RandomStrategy();
    carGame.startGame(randomMoveStrategy);
  }
}
