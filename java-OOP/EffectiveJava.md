### Item3 : private 생성자나 열거 타입으로 싱글텀임을 보증하라

## 싱글톤이란?
인스턴스를 오직 하나만 생성할 수 있는 클래스를 말한다.
싱글톤은 개념적으로는 전역 변수입니다. 특히 변경이 가능한 경우(mutable)는 사용을 피해야하고, 일반적으로 전역변수는 남용하면 안됩니다.

## 싱글톤의 생성방법 세가지
1. public static 멤버변수를 final 필드로 하는 방법
   ```java
    public class Singleton1 {
  	    // public static final 멤버
	    public static final Singleton1 a = new Singleton1();
  	    //private 생성자 
  	    private Singleton() { 생략 }
  
  	    public void doSomething() { 생략 }
    }
   ```

2. 정적팩토리 메서드를 public static 멤버로 제공하는 방법
   
   ```java
    public class Singleton2 {
        private static final Singleton2 a = new Singleton2();
        private Singleton() { 생략 }
        // 정적 펙토리 메서드
        public static Singleton2 getInstance() { return a; }

        public void doSomething() { 생략 }
    }
   ```


3. 열거타입(Enum)을 사용하는 방법
```java
public enum Singleton3 {
	a;
  	public void doSomething() { 생략 }
}
```
<br>

---

## Enum을 사용하면 좋은 이유
1. Enum을 사용한 방법이 코드가 간결해서 좋다.
```java
class MyTypeA {
    public static MyTypeA a;
    public static MyTypeA b;
    public static MyTypeA c;
    public static MyTypeA d;
}
```
```java
enum MyTypeB {
    a, b, c, d
}
```
>같은 기능의 코드지만 enum이 훨씬 간결하다.

2. 사용할 때 싱글톤임이 명확하게 보인다.
```java
Singleton1 a = Singleton1.a;
a.doSomething();
```

3. class 싱글톤의 문제는 멀티스레드 환경에서 인스턴스가 두개가 생길 수 도 있습니다.
4. enum자체가 serialization과 thread-safety를 보장