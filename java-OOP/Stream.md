# 스트림 (Stream)
스트림은 람다를 활용할 때 사용하는 기술 중 하나입니다.

보통은 배열, 컬렉션들을 다룰 때 `for`이나 `for each`문을 통해서 요소 하나씩 꺼내서 다룰 수 있습니다.

간단하면 상관없지만, 코드가 길어지고 로직이 복잡해지거나 메소드가 많아지면 루프를 여러 번 돌아 시간효율이 떨어질 수도 있습니다.

스트림이란 "**데이터의 흐름**"입니다. 배열, 컬렉션을 대상으로 함수들을 조합해서 원하는 결과로 데이터를 가공합니다. 이 부분에서 **람다**(**lambda**)를 사용해서 배열, 컬렉션을 함수형으로 짧고 간결하게 처리할 수 있습니다.





## 스트림 특징

- 연산이 일관성있어서 자료의 처리가 쉽고 간단 
- 한번 생성하고 사용한 스트림은 재활용 불가(소모)
- 스트림 연산은 기존 자료를 변경하지 않음 (원본 유지)
- 간단하게 병렬처리가 가능 (multi-threading)

<br>
스트림의 과정은 크게 3가지로 분류됩니다.

```shell
1. 생성하기 : Stream 인스턴스 생성
2. 가공하기 : Stream 메소드들을 활용하여 원하는 결과로 만들어가는 중간연산
3. 결과 만들기 : 최종연산
```

<br>

#### 예제
```java
int [] arr = {1, 2, 3, 4, 5};

Arrays.stream(arr).forEach(n->System.out.print(n));

//출력 결과
12345
```

```java
int [] arr = {1, 2, 3, 4, 5};

IntStream s = Arrays.stream(arr);

s.forEach(n->System.out.print(n));
```

<br>

---

## 중간연산
중간연산에 자주 사용되는 함수들입니다. 더 많지만 조금만 알아보겠습니다.
### filter()
요소들을 조건에 따라 걸러내는 작업을 해줍니다.

길이의 제한, 특정문자포함 등 의 작업을 하고 싶을때 사용 가능합니다.
```java
ArrayList<Integer> arr = new ArrayList<>();
for (int i = 0; i < 10; i++) {
    arr.add(i);
}
//짝수인것만 걸러내서 새로운 리스트에 저장
List<Integer> arr2 = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
for (Integer i : arr2) {
    System.out.println(i);
}

//출력결과
2
4
```
### map()
요소들을 특정조건에 해당하는 값으로 변환해 줍니다.

요소들을 대,소문자 변형 등 의 작업을 하고 싶을떄 사용 가능 합니다.
```java
List<String> arr = new ArrayList<>();
arr.add("Tomas");
arr.add("Edward");
arr.add("Jack");

//toUpperCase로 문자열을 모두 대문자로 바꿉니다.
arr.stream().map(String::toUpperCase).forEach(System.out::println);

//출력결과
TOMAS
EDWARD
JACK
```

## 최종연산
최종연산에 자주 사용되는 함수들로는 **forEach**(), **count**(), **sum**() 등이 있습니다.
