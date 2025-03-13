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

CarTest
1. CarNameValidator 테스트 후 CarName 객체생성 테스트 
2. PositionValidator 테스트 후 Position 객체생성 테스트
3. Car 객체생성 테스트 
4. Car.move 메서드 테스트 ( 4이상의 값이 들어가면 움직인다. )

CarsTest
1. CarList 객체생성 테스트
2. Cars 객체생성 테스트
3. Cars.moveAllCars 메스드 테스트
4. Cars.getRaceFinalWinner 메서드 테스트

-OutputView 
-InputView
-Game (controller)



< 설계 >
-----------------------------------------
interface

-MoveStrategy : 자동차를 어떤 조건에 의해 움직일 것인지
    - RandomMoveStrategy() 
-------------------------------------------
Model
1. Class Car 
    - 멤버 변수
      - CarName carName : 자동차의 이름
      - Position position : 자동차의 이동거리

    - 메서드
      - void move(MoveStrategy moveStrategy) : 
      - CarInfo getCarInfo(); 
---------------------------------------------

class CarName 
    - 멤버 변수
        - String name

class Position
    - 멤버 변수
        - int position
      
---------------------------------------------
model

class Cars
    - 멤버 변수
        - CarList carList

    - 메서드
        - CarInfoList getCarInfoList() : 자동차들의 각각의 결과들을 DTO에 담아 반환한다. 
        - RaceFinalWinnner getRaceFinalWinner() 
        - void moveAllCars()
        - 
-------------------------------------------
class CarList
    - 멤버 변수
        - List<Car> cars


    - 메서드
        - void moveCars()
        - CarInfoList generateCarInfoList()
        - RaceFinalWinner gnerateRaceFinalWinner()

--------------------------------------------
DTO

class record CarInfoList(List<CarInfo> carInfoList)
class record CarInfo(CarName name, Position position)

---------------------------------------------
Controller
1. Class Game
    - 멤버 변수
      - private static final OutputView
      - private static final IntputView

    - 메서드
      - void playGame()
      - void playOneRound(Cars cars, TryNumber tryNumber)
      - Cars generateCars() 
      - TryNumber generateTryNumber()
      - void OneRoundResult()
      - void getGameResult()

-------------------------------------------
View

1. InPutView
    - 메서드
      - Cars readCarsName()
      - TryNumber readTryNumber()

2. OutPutView
    - 메서드
      - void printRoundResult(CarInfoList carInfoList) : 게임 중간 결과
      - void printWinner(RaceFinalResult raceFinalResult) : 승자 출력

--------------------------------------------
utils

class CarNameValidator
class TryNumberValidator