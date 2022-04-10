# **enumerate()**

for loop를 돌릴때 _리스트, 튜플, 문자열, 반복자, 제너레이터_ 등 각각의 원소들의
_**인덱스**_ 와 _**원소값**_ 을 동시에 접근할 수 있게 해준다.

### **기본포맷**

```py
for <index, value> in enumerate(<목록>) :
```

### 예제

```py
for i, value in enumerate(['a','b','c']):
  print(i, value)

# 출력 결과
0, a
1, b
2, c
```

시작 인덱스를 0이 아니게 하고싶은 경우

```py
enumerate(<목록>, start = <숫자>) #<숫자>부터 인덱스가 시작된다.
```
