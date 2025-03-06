< 구현 과정 >

1. 자동차입력이 올바른지 판단한다. 
    - 자동차 이름이 5자를 초과하면 안 된다.
    - 쉼표로 구분되어야 한다.
    - 
2. 각각의 이름마다 Car 객체를 생성한다. 그리고 해당 Car들을 게임에 등록한다.

3. 시도 횟수를 입력받는다.

4. 경주에 참여한 차들을 움직일지 결정한다.
    - 랜덤값이 4이상이면 움직인다.


- Class Car / String name, int moveCnt, Random random / void move()
- Class RacingGame / List<Car> players ,int tryCnt / void playRound() 
