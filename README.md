# java-ladder

### LadderGame
- [x] 사다리 게임에 사람이 참여한다.
[//]: # (  - [ ] 사람아 2명 보다 적다면 `IllegalArgumentException` 가 발생한다.)
- [x] 사다리를 생성한다.
- [ ] 사다리 게임 결과가 사람 수 만큼 있다.
- [ ] 한 명당 한 가지의 결과를 얻을 수 있다.

### Ladder
- 사다리 구조
  - [x] 높이 만큼 Row 를 갖는다.
    - [x] 높이가 1 보다 작으면 `IllegalArgumentException` 가 발생한다.
- 동작
  - [x] 임의의 위치에서 시작해 사다리를 내려간 후 위치를 반환한다.
    - [x] 위치를 사람 수 이상 이거나 음수를 입력하면 `IllegalArgumentException` 가 발생한다.

### Row
- 생성
  - [x] 사람 수 만큼 Direction 들을 갖는다.
    - [x] 사람이 2명 보다 적다면 `IllegalArgumentException` 가 발생한다.
  - [x] 가장 왼쪽의 Direction은 왼쪽으로 생성될 수 없고 가장 오른쪽의 Direction 은 오른쪽으로 생성될 수 없다.
  - [x] 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - `|-----|-----|` 모양과 같이 가로 줄이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.
- 동작
  - [x] 한 줄의 사다리를 내려갈 수 있다.
    - [x] 내려가기 전 위치를 입력하면 내려간 후 위치를 반환한다.

### Direction
- [x] 위치를 이동시킬 값을 갖는다.
  - [x] 왼쪽으로 가려면 -1 을 갖는다.
  - [x] 오른쪽으로 가려면 -1 을 갖는다.
  - [x] 제자리에 있으려면 0을 갖는다.

### Name
- 사람 이름
  - [x] 이름은 1~5글자 
  - [x] 영어, 숫자

### InputView
- 사람 이름 입력
  - [x] 사람 이름은 쉼표(,)를 기준으로 구분한다.
  - [x] 이름 내 공백은 허용 (ex: '망 쵸 , 마       크' -> '망 쵸,마       크' )
  - [x] 이름 간의 공백은 자름 (ex: '망쵸 , 마크' -> '망쵸,마크' )
- 실행 결과 입력
  - 위와 같음


### OutputView
- [x] 이름을 출력한다.
- [ ] 사다리를 출력한다. 
  - [ ] 가로 줄의 길이는 5이다.
- [ ] 결과물을 출력한다.
- [ ] 개인별 이름을 입력하면 개인별 결과를 출력한다.
  - [ ] 없는 사람을 입력하면 `IllegalArgumentException` 가 발생한다.
- [ ] "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.


## 실행 결과 예시

```text
참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)
pobi,honux,crong,jk

실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)
꽝,5000,꽝,3000

최대 사다리 높이는 몇 개인가요?
5

사다리 결과

pobi  honux crong   jk
    |-----|     |-----|
    |     |-----|     |
    |-----|     |     |
    |     |-----|     |
    |-----|     |-----|
꽝    5000  꽝    3000

결과를 보고 싶은 사람은?
pobi

실행 결과
꽝

결과를 보고 싶은 사람은?
all

실행 결과
pobi : 꽝
honux : 3000
crong : 꽝
jk : 5000
```
