## 제네릭 (generic)

자바에서 재네릭 (genric)이란 데이터 타입을 일반화합니다(generalize).
재네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법입니다.

### 제네렉의 장점
1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있습니다.
2. 반환 값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.

### 제네릭 기본 포맷
```java
class 클래스명 <T>{
  T element;
  void setElement(T element){
    this.element = element;
  }
  T getElement(){ return element; }
}
```
<T> 에서 T를 타입변수(type variable)이라고 합니다. 관례적으로 T를 많이쓰지만 어떠한 문자를 사용해도 상관없으며 여러 타입 경우 쉼표로 구분합니다.
  
> 타입변수 자리에는 기본타입(int, char 등)을 바로 사용할 수 없습니다.
  Integer, Charactor 등과 같이 래퍼클래스로 바꿔서 사용해야합니다.
  
