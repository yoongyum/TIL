## @OneToMany

`@OneToMany`어노테이션을 이용해서 Entity간의 관계를 맺을 수 있습니다.

회원은 기본적으로 게시물이 없거나 1개 이상을 소지할 수 있습니다.

회원 하나에 게시물 N개가 되기 때문에 1:N 관계가 됩니다.

### 1. 속성

- targetEntity
- cascade
- fetch
- mappedBy
- orphanRemoval

#### 1.1 targetEntity
관계를 맺을 Entity Class를 정의

#### 1.2 cascade
현 Entity의 변경에 대해 관계를 맺은 Entity도 변경 전략을 결정

속성값에는 CascadeType이라는 enum에 정의 되어 있으며 enum값에는 ALL, PERSIST, MERGE, REMOVE, REFRESH, DETACH가 있음


#### 1.3 fetch
관계 Entity의 데이터 읽기 전략을 결정

FetchType.EAGER, FetchType.LAZY로 전략을 변경 
두 전략의 차이점은 EAGER인 경우 관계된 Entity의 정보를 미리 읽어오는 것이고 LAZY는 실제로 요청하는 순간 읽음
#### 1.4 mappedBy
양방향 관계 설정시 관계의 주체가 되는 쪽에서 정의
#### 1.5 orphanRemoval
관계 Entity에서 변경이 일어난 경우 DB 변경을 같이 할지 결정

cascade와 다른점은 cascade는 JPA 레이어 수준이고 이것은 DB레이어에서 처리, 기본은 false

---

## @ManyToOne

`@ManyToOne`어노테이션은 `@OneToMany`와 크게 다르지 않습니다.
차이점은 `@OneToMany`은 1:N이면 `@ManyToOne`은 N:1 관계라고 보시면 됩니다.

회원은 게시물을 여럭개 소지할 수 있습니다. 그래서 게시물 입장에서는 `@ManyToOne`이 됩니다.

### 1. 속성
- targetEntity
- cascade
- fetch
- optional
  
#### 1.1 optional
이 속성은 false로 설정했을 때 해당 객체에 null이 들어갈 수 있음
반대로 반드시 값이 필요하다면 true가 들어감, (defalut값은 true)