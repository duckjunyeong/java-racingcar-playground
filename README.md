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



< 피드백 >
1. 코드 convention을 지키자. 클래스내에서 상수를 정의할 때도 클래스상수, 인스턴트상수 순으로 작성하고, equals함수와 같은 것들은 맨 마지막에 작성해야한다.
2. 메서드를 작성할 때 문맥별로 나누어라. 글을 작성할 때 문단을 나누듯이 "엔터"를 통해 로직단위를 나누어라.
3. 네이밍을 하는데 있어 좀 더 의미있는 네이밍을 해보자. code complete 책을 통해 네이밍을 공부하라 (https://remotty.github.io/blog/2014/03/01/hyogwajeogin-ireumjisgi/)
    - num 대신에 Count, Index를 사용해라 
    - 그리고 total, average, record, string과 같은 것들은 맨 마지막에 작성
    - 메서드명을 작성할 때 메서드가 하는 모든 일을 변수명에서 알 수 있게 만들어야한다. 함수가 하는 역할이 모호하다면 그 메서드의 목표가 무엇인지 명확하게 인지해
        함수가 하는 일에 대해 명확하게 만들어야한다. ex) HandleOutput -> FormatAndPrintOutput
4. 앞으로 오픈소스(Spring) 코드를 읽어보면 좋을 것 같다
5. 불편 객체를 만드는 것이 코드의 안정성을 더 해줄 수 있다. final을 가능한 잘 활용하자.
6. 인스턴스 변수를 2개까지 만들기위해 노력해보자. ex) CarList와 Winner 변수를 둘 필요가 없는게 winner변수는 CarList를 통해 바로 구해서 반환해주면 된다.)
7. 만약 객체의 값을 변경하고 싶으면 생성자를 통해 새로운 객체를 만들어서 사용하라. 
8. 테스트코드를 작성할 때 경계값을 기준으로 테스트해보아라. 그 경계값으로 모든 경우의 수를 커버할 수 있게
9. 생성자를 여러 개 만드는 것은 꽤 권장되는 방법이다 테스트할 때 필요한 생성자가 있다면 일단 만들어보자
10. 처음에 피드백코드를 작성하기 전에 getter메서드를 사용하지 말라고 해서 layer간에도 getter메서드를 사용하지 않으니 구조가 무너짐, 근데 layer간의 DTO을 통한
데이터 전달은 허가한다. 쓰지말라고 하는 것은 Model 클래스들끼리 사용하지 말라는 것 
11. 핵심로직을 test할 때 private메서드가 동시에 만들어질 수 있다. 근데 그 private메서드가 너무 로직이 커지게 되면 클래스로 분리시켜야 하는 의심을 해야한다.
그러면 그 로직은 테스트 단위가 된다. 
12. TDD를 작성할 때 테스트할 메서드를 public을 생성하고 그 외의 것들은 private으로 캡슐화를 시켜라. 지금 모든 메서드들이 public으로 오픈되어있다.
https://www.slipp.net/questions/253 < private 메서드에 대한 Testing > 
