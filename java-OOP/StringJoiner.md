# StringJoiner
스트링 조이너는 구분자를 기준으로 들어오는 스트링들을 이어줍니다.

### 예제
```java
var sj = new StringJoiner(", "); //구분자 ", "

sj.add("abcd").add("EFGH");

System.out.print(sj);

//출력결과
abcd, EFGH
```

### 예제 2

```java
var sj = new StringJoiner(", ","<",">");  //구분자 ", "    맨앞 "<" 맨뒤 ">"

sj.add("abcd").add("EFGH");

System.out.print(sj);

//출력결과
<abcd, EFGH>
```
