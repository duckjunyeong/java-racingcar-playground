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
3. Cars.getRaceFinalWinner 메서드 테스트

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


---------------------------------------------------------------
< 이번 코드를 작성하면서 >
- 확실히 도메인지식이 쌓이면 설계를 하기가 용이하다. 어떻게 코드를 작성해나갈지에 대해 list를 작성하고 그 list를 기반으로 TDD를 어떻게 할 것인지
설계하였다. 또한 TDD계획을 작성한 후 그 계획을 보면서 테스트를 하기 위해서 어떤 클래스가 존재해야하며 어떤 메서드가 있어야하는지 고민하고 설계하였다.
이렇게 문서화작업을 하고 난 뒤 코드를 작성하니 내가 지금 무엇을 해야하는지 명확하게 파악할 수 있어 몰입할 수 있었다. 또한 미리 문서화작업을 통해 전체적인
설계의 흐름을 파악하고 나니 매끄럽게 코드 구현이 되었으며 어느 지점으로 돌아가 다시 코드를 작성하는 일을 줄일 수 있었다. 또한 유닛별로 테스트를 하니 테스트를 
진행한 메서드의 경우 확실한 기능을 보장하니 어떤 로직에서 문제가 있엇는지 파악하는데 시간을 줄일 수 있었다. TDD를 하기전에는 테스트가 안 된 메서드들을 많이
작성하고 한 번에 기능테스트를 하니 코드를 작성할 때도 "근데 동작될려나"라는 의심을 품고 코드를 작성해왔지만 TDD를 하면서는 확신을 가지고 코드를 작성하니 
프로그래밍을 하는데 전보다 더 많은 흥미를 가져다주고 있다.