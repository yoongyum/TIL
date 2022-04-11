# 싱글톤 패턴

어플리케이션이 실행될 때, 최초로 한번만 메모리에 할당된다.

메모리에 인스턴스를 만들어 사용한다.

<br>

## **예제**

```java
public class Company{
  private static Company instance = new Company();

  //private 생성자
  private Company(){

  }
  public static Company getInstance(){  //이 메소드를 통해서만 객체를 생성할 수 있기 때문에 static으로 선언한다.
      if( instance == null){
          instance = new Company();
      }
  }
}
```

## 장점

-   고정된 메모리를 사용하여 메모리 낭비를 방지
-   싱글톤으로 만들어진 클래스의 인스턴스는 전역이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유하기 쉬움

-   인스턴스가 절대적으로 한 개만 존재하는 것을 보증하고 싶은 경우 사용
-   한번 생성되면 그 이후로는 객체 로딩시간이 줄어 성능이 좋음

## 단점

-   싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유시킬 경우 다른 클래스와 결합도가 높아진다.
-   결합도가 높아지면 유지보수가 어려워진다.
-   꼭 필요한 경우에만 사용하자
