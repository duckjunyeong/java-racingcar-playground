package Constant;

public enum Err {
    EMPTY_STRING("빈 문자열은 사용할 수 없습니다."),
    LENGTH_EXCEEDED("제한된 문자열의 길이를 벗어났습니다."),
    NEGATIVE_NUM("음수또는 0은 사용할 수 없습니다."),
    EMPTY_STREAM_MESSAGE("스트림이 비어있습니다.");

  private String message;

  Err(String message){
      this.message = message;
  }

  public String getMessage(){
    return String.format("[Error] %s", message);
  }
}
