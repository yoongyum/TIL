# 템플릿 메서드 패턴

- 추상 메서드나 구현된 메서드를 활용하여 코드의 흐름을 정의하는 메서드
- final로 선언하여 하위 클래스에서 재정의 할 수 없게 함
- 프레임워크에서 많이 사용되는 설계 패턴
- 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서 다르게 구현되어야 하는 부분은 추상메서드로 선언하여 하위 클래스에서 구현

## final
- 값이 변경될 수 없는 상수
- 하위 클래스에서 재정의 할 수 없는 메서드
- 상속할 수 없는 클래스

#### Define.java
```java
public class Define{
  public static final int MIN = 1;
  public static final int MAX = 999999;
  public static final double PI = 3.14;
  public static final String GREETING = "Good Morning!";
  public static final int MATH_CODE = 1001;
  public static final int CHEMISTRY_CODE = 1002;
}
```

#### UsingDefine.java
```java
public static void main(String[] args){
  System.out.println(Define.GREETING);
  System.out.println(Define.MIN);
  ..
  ..
}
```
