import java.util.Random;

public class RandomStrategy implements MoveStrategy{

  @Override
  public boolean move(){
    return getRandomNumber() >= 4;
  }

  protected int getRandomNumber(){
    Random random = new Random();
    return random.nextInt(9) + 1;
  }
}
