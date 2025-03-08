public class OutputView {
  public String translateToStr(WinnerList winnerList) {
    return winnerList.getWinnersName();
  }

  public String printWinnerList(WinnerList winnerList) {
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append(translateToStr(winnerList));
    strBuilder.append("이 최종 승자입니다.");

    String str = strBuilder.toString();
    System.out.println(str);
    return str;
  }

  public String printRoundResult(Players players) {
    String str = players.getPlayRoundResultString();
    System.out.println(str);
    return str;
  }

  public void printWriteCarName(){
    System.out.println("자동차의 이름을 입력해주세요.");
  }

  public void printWriteTryCnt(){
    System.out.println("시도 횟수를 입력해주세요.");
  }
}
