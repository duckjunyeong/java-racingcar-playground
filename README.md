< 구현 과정 >
1. 자동차의 이름을 입력받는다.
    - 5자리 이하, 쉼표로 구분된다.
    - 빈 문자열X

2. 시도횟수를 입력받는다.
    - 양의 정수이어야 한다.

3. 시도횟수만큼 라운드를 진행한다.
    - 자동차를 움직일지 결정한다. 랜덤값이 4이상이면 움직인다.
    - 라운드결과를 출력한다.

4. 승자를 출력한다. 

< TDD 과정 >

1. Car클래스의 메서드 move: 랜덤값이 4이상이면 자동차를 움직인다.
2. CarGame클래스의 메서드 getWinners: 승자들이 누군지 판단한다.
3. InputValidator/CarNameValidator클래스의 메서드 checkCarName: 올바른 자동차이름인지 판단한다.
4. InputValidator/TryNumberValidator클래스의 메서드 checkTryNumber: 올바른 시도횟수인지 판단한다.