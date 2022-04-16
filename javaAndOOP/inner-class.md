# 1. 내부클래스 (inner class)

클래스 내부에 선언한 클래스로 다른 외부 클래스에서 사용할 일이 거의 없는 경우에 **내부 클래스**로 선언해서 사용합니다. 다른 말로 **중첩클래스**라고도 합니다.

#### 내부클래스의 종류
- 인스턴스 내부 클래스
- 정적 내부 클래스
- 지역 내부 클래스
- 익병 내부 클래스


## 1.1 인스턴스(instance) 내부 클래스

- 내부적으로 사용할 클래스를 선언 (private 권장)
- 외부 클래스가 생성된 후 생성
- private이 아닌 내부 클래스는 외부 클래스에서 생성 가능 (정석이 아님)
- 정적변수를 사용 불가능

```java
Outclass outClass = new OutClass();
Outclass.InClass inClass = outClass.new InClass(); //private이 아닌 경우 외부에서 선언
```
<br>

#### 예제 코드 

```java
class OutClass{//외부 클래스
  private int num = 10;
  private static int sNum = 20;
  private InClass;  //private 내부클래스

  public OutClass(){  //생성자에서 내부 클래스 생성
    inClass = new InClass();
  }

  private class InClass{
    int inNum = 100;

    void inTest(){
      System.out.println(num);//외부 클래스의 인스턴스 변수
      System.out.println(sNum);//외부 클래스의 스태틱 변수
      System.out.println(iNum);//내부 클래스의 인스턴스 변수
    }
  }
  public void usingClass(){//innerClass의 메소드를 간접적으로 사용
    inClass.inTest();
  }
}
```

---

## 1.2 정적(static) 내부 클래스

- 외부 클래스 생성과 무관하게 사용
- 정적 변수/메서드 사용
- 외부 클래스의 인스턴스 변수 사용 불가능

<br>

#### 예제 코드
```java
class OutClass{
  private int num = 10;
  private static int sNum = 20;
  private InClass;  //private 내부클래스

  public OutClass(){  //생성자에서 내부 클래스 생성
    inClass = new InClass();
  }
  static class InClass{
    int iNum = 100;
    static int sInNum = 200;

    void inTest(){
      //System.out.println(num);//외부 클래스의 인스턴스 변수 사용불가
      System.out.println(sNum);//외부 클래스의 스태틱 변수
      System.out.println(iNum);//내부 클래스의 인스턴스 변수
      System.out.println(sInNum)//내부 클래스의 스태틱 변수
    }

    static void sTest(){//정적 메서드에서는 스태틱변수만 쓸 수 있다.
      System.out.println(sNum);//외부 클래스의 스태틱 변수
      System.out.println(sInNum)//내부 클래스의 스태틱 변수
    }
  }
}
```
main
```java
OutClass.InClass sInClass = new OutClass.InClass();
sInClass.inTest();

OutClass.InClass.sTest();//클래스 호출들과는 무관하게 바로 static메서드 호출 가능
```
---

## 1.3 지역(local) 내부 클래스

- 지역 변수와 같이 메서드 내부에서 정의하여 사용하는 클래스
- 메서드의 호출이 끝나면 메서드에 사용된 지역변수의 유효성은 사라짐
- 메서드 호출 이후에도 사용해야하는 경우가 있을 수 있으므로 지역 내부 클래스에서 사용하는 메서드의 지역변수나 매개 변수는 final로 선언

<br>

#### 예제 코드

```java
class Outer{
  int outNum = 100;
  static int sNum = 200;


  Runnable getRunnable(int i){
    int num = 10;

    class MyRunnable implements Runnable{
      int localNum = 1000;

      @Override 
      public void run(){
        
        //i = 50;//final을 붙이지 않아도 자동으로 final처리
        //num = 21;//따라서 값을 출력하는건 가능하나 값을 바꿀 수 는 없다.


        System.out.println(i);//메소드 파라미터
        System.out.println(num);//메소드 지역변수
        System.out.println(localNum);//멤버변수

        System.out.println(outNum);//외부 클래스 인스턴스 변수
        System.out.println(Outer.sNum);//외부 클래스 정적 변수
      }
    }
    return new MyRunnable();
  }
}
```
main
```java
Outer out = new Outer();
Runnable runner = out.getRunnable(100);

runner.run();
```


---


## 1.4 익명(anonymous) 내부 클래스 

- 이름이 없는 클래스
- 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
- 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환할 수 있음.

<br>

#### 예제 코드
위의 코드에서 바뀐 모양입니다.
```java
Runnable getRunnable(int i){
    int num = 10;

    return new Runnable(){
      int localNum = 1000;

      @Override 
      public void run(){
        //localinner처럼 final은 수정 불가능하다.

        System.out.println(i);//메소드 파라미터
        System.out.println(num);//메소드 지역변수
        System.out.println(localNum);//멤버변수

        System.out.println(outNum);//외부 클래스 인스턴스 변수
        System.out.println(Outer.sNum);//외부 클래스 정적 변수
      }
    };
}

```

익명 내부 클래스가 가장 많이 쓰인다고 한다.

---

# 2. 내부 클래스의 장점
내부 클래스를 사용하면 다음과 같은 장점을 가질 수 있습니다.


- 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있게 됩니다.
- 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킵니다.
- 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있습니다.