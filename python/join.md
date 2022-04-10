# **join()**

`join()`메소드는 문자열리스트의 각 요소들을 하나의 스트링으로 합쳐주는 기능을 한다.

### **기본포맷**

```py
'구분자'.join(<문자열 리스트>)
```

### 예제

```py
a = ['a', 'b', 'c', 'd']

print(''.join(a))
print(' '.join(a))
print(','.join(a))

# 출력 결과
abcd
a b c d
a,b,c,d
```
