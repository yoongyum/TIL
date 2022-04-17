# 람다식 (Lambda expression)

자바는 객체 지향 프로그래밍입니다.
기능을 수행하기 위해서 객체를 만들고 그 객체 내부에 멤버 변수를 선언하고 기능을 수행하는 메서드를 구현합니다.

Java8 이상부터 함수형 프로그래밍 방식을 지원합니다. 이를 람다식이라고 합니다.

함수의 구현과 호출만으로 프로그래밍이 수행되는 방식입니다.

함수형 프로그래밍은 순수함수를 구현하고 호출함으로써 외부자료에 부수적인 영향을 주지 않도록 하는 방식입니다.

## 람다식 문법

- 함수의 이름이 없다.
- 매개 변수와 매개변수를 이용한 실행문 (매개변수)-> {기능;}
- 매개변수의 자료형을 생략가능
- 매개변수가 하나면 괄호 생략가능, 두개이상이면 불가능
- 실행문이 한문장이면 return 생략가능

#### 예제 코드

```java
int add(int x, int y){
  return x+y;
}

//람다식으로 표현
(int x, int y) -> {return x+y;} //add()
(x,y) -> x+y;

str -> {System.out.println(str);}
str -> str.length;  //str길이 반환
```

## 함수형 인터페이스

- 람다식을 선언하기 위한 인터페이스
- 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언
- **@FunctionalInterface** 애노테이션(annotation)
  함수형 인터페이스라고 명시, 메서드가 하나 이상이면 Error나도록함


#### 예제 코드
```java
@FunctionalInterface
public interface MyNumber{
  int getMax(int a, int b);
}
```

```java
//main()
MyNumber mn = (x, y)-> x > y ? x : y; //getMax구현

System.out.println(mn.getMax(10, 20));
```

