# 인터페이스

모든 메서드 추상메서드로 정의
일반적인 멤버변수는 선언 불가 ( 모든 변수는 static final이 붙음)

인터페이스는 하위객체에서 extends를 사용하지 않고 implements를 사용한다.

## 예제 코드

#### Calc.java
```java
public interface Calc{
  double PI = 3.14; //자동으로 static final 처리
  int ERROR = - 999999999; //자동으로 static final 처리
  
  //자동으로 abstrack 처리
  int add(int a , int b);
  int sub(int a , int b);
  int mul(int a , int b);
  int div(int a , int b);
}
```

#### Calculator.java
>Calc인터페이스를 상속받음

```java
public abstract class Calculator implements Cals{
  @Override
  public int add(int a, int b){
    return a+b;
  }
  @Override 
  public int sub(int a, int b){
    return a-b;
  }
}
```
#### CompleteCalc.java
>Calculator 추상클래스를 상속받음

```java
public class CompleteCalc extends Calculator{
  @Override 
  public int mul(int a, int b){
    return a*b;
  }
  @Override 
  public int div(int a, int b){
    return b == 0 ? ERROR : a/b;
  }
}
```

## 인터페이스와 추상클래스의 차이점

#### 외형적차이 
추상클래스는 일반메서드와 멤버변수를 포함할 수 있지만, 인터페이스는 추상메서드만 갖고 일반 멤버변수는 갖지 못한다.

#### 내부적(목적) 차이
자바는 다중 상속을 지원하지 않는다. 하지만 인터페이스는 여러 개의 구현(상속)이 가능하다.
- 클래스상속 : 슈퍼클래스의 기능을 확장
- 인터페이스 구현 : 구현받은 객체들에게 동일한 동작을 약속하기 위한 존재

