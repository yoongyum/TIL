# 이름이 있는 break문
중첩된 for문에 이름을 설정한다면 break문을 사용하여 특정 위치의 for문을 종료시킬 수 있다.

### 예제 코드
```java
    outer: for(int i=0;i<100;i++){
      for(int j =0; j < 100;j++){
        if( j == 30) break outer;
      }
```
<br>

## continue도 된다.
go-loop랑 비슷하다고 생각하시면 됩니다.


```java
    outer: for(int i=0;i<100;i++){
      for(int j =0; j < 100;j++){
        if( j == 30) continue outer;
      }
```