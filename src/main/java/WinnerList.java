import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WinnerList {
  private List<Car> list;

  public WinnerList(){
    list = new ArrayList<>();
  }

  public WinnerList(List<Car> list){
    this.list = list;
  }

  public void add(Car jun) {
    list.add(jun);
  }

  public String getWinnersName() {
    int size = list.size();
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < size; i++){
      appendWinnerName(i, str, size);
    }
    return str.toString();
  }

  private void appendWinnerName(int i, StringBuilder str, int size) {
    list.get(i).appendName(str);
    appendSpace(i, str, size);
  }

  private static void appendSpace(int i, StringBuilder str, int size) {
    if (i != size - 1){
      str.append(", ");
    }
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || !(obj instanceof WinnerList)) return false;
    WinnerList list = (WinnerList) obj;
    return Objects.equals(this.list , list.list);
  }
}
