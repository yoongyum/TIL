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
관계를 맺을 Entity Class를 정의합니다.

#### 1.2 cascade

#### 1.3 fetch

#### 1.4 mappedBy

#### 1.5 orphanRemoval