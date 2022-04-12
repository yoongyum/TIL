# instanceof

원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드
맞으면 true, 틀리면 false 리턴

### 예제

```java

Animal animal = new Human();

if( animal instanceof Human){
  //animal이 Human 타입이 맞음
  Human human = (Human) animal; //다운캐스팅
}
```
