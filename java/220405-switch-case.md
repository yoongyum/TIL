# **switch case**

> Java 14부터 지원되는 switch Expression

-   `switch문에서 결과값을 전달할 수 있음`<br>
-   `각 case에서 반환할 키워드로 yield를 사용`<br>
-   `리턴 값이 없는 경우는 오류가 생김`

```java
int day = switch (month){
  case 1, 3, 5, 6, 7, 8, 10, 11, 12 ->{
    System.out.println("한 달은 31일입니다.");
    yield 31;
  }
  case 4, 6, 9, 11 -> {
    System.out.println("한 달은 30일입니다.");
    yield 30;
  }
  case 2 -> {
    System.out.println("한 달은 28일입니다.");
    yield 28;
  }
  default -> {
    System.out.println("존재하지 않는 달 입니다.");
    yield 0;
  }
}
```
