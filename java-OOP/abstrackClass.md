# 추상 클래스 (abstrack class)

- 구현코드 없이 메서드 선언만 있는 추상 메서드를 포함한 클래스
- 메서드 선언 : 반환타입, 메서드이름, 매개변수로 구성
- abstrack 예약어 사용
- 추상 클래스는 new 할 수 없음 (인스턴스화 불가능)

<br>

### 추상클래스 구현하기
- 메서드에 구현 코드가 없으면 abstrack로 선언
- abstact로 선언된 메서드를 하나라도 갖고있으면 abstract 클래스로 선언
- 모든 메서드가 구현 된 클래스라도 abstract class면 인스턴스화 불가능
- 추상클래스의 추상메서드는 하위 클래스가 상속하여 구현

---

<br>

## 예제


### Computer.java
```java
public abstract class Computer{
  public abstract void display(); //추상메서드
  public abstract void typing();  //추상메서드
  
  public void turnOn(){
    System.out.println("전원을 켭니다.");
  }
  
  public void turnOff(){
    System.out.println("전원을 끕니다."); 
  }
}
```

### Desktop.java
```java
public class Desktop extends Computer{
  
   @Override
   public void display(){ //Computer의 추상메서드
      System.out.println("Desktop display");
   }
  
   @Override
   public void typing(){ //Computer의 추상메서드
      System.out.println("Desktop typing");
   }
  
   @Override
   public void turnOff(){ //재정의
      System.out.println("Desktop turnOff"); 
   }
}
```
