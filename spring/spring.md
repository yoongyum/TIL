# 🍃 Spring Framework

자바 플랫폼을 위한 오픈소스 애플리케이션입니다.
동적인 웹사이트를 개발하기 위한 여러 가지 서비스를 제공합니다.

### POJO (Plain Old Java Object)
객체 지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트를 말합니다. 그러한 POJO에 애플리케이션의 핵심로직과 기능을 담아 설계하고 개발하는 방법을 POJO 프로그래밍이라고 할 수 있습니다.

- 깔끔한 코드
- 간편한 테스트
- 객체지향적인 설계를 자유롭게 적용

### Di (Dependency Injection) : 의존성 주입
의존성이란 객체가 혼자서는 처리할 수 없어 동작하려면 다른 객체가 필요하다는 뜻입니다.
주입이란 Spring에서 객체를 외부에서 밀어 넣는 뜻입니다.

즉, 의존하고있는 필요한 객체를 외부에서 주입한다는 뜻입니다.

#### DI : 장점
- 의존성으로 부터 격리시켜 코드 테스트에 용이
- DI를 통하여, 불가능한 상황을 Mock와 같은 기술을 통하여, 안정적으로 테스트가 가능
- 코드를 확장하거나 변경 할때 영향을 최소화 한다.(추상화)
- 순환참조를 막을 수 있다.

### IoC (Invertion Of Control) : 제어 역행
객체 생성과 소멸등 전반적인 관리를 프레임워크의 컨테이너가 대신 하는 것을 의미한다.
Spring에서는 객체(Object)를 Bean이라고 한다.
즉, 개발자에서-> 프레임워크로 제어의 객체관리의 권한이 넘어갔음

### AOP (Apect-Oriented Programming) : 관점지향 프로그래밍
관점지향은 어떤로직을 기준으로 핵심적인 관점, 부가적인 관점으로 나누어서 보고 그 관점을 기준으로 각각 모듈화 하겠다는 것입니다.
cross-cutting concern VS core concern 분리

<br>

 # 🍂 Spring Boot

 스프링은 기능이 많은 만큼 환경설정이 복잡합니다. 이를 보완한 것이 스프링 부트입니다.
 스프링부트는 스프링을 사용하기 위해 많은 부분을 자동으로 설정해줍니다.

 ## ⚔ 장점

 1. 스프링부트 내부에 Tomcat이 포화되어있기때문에 따로 Tomcat을 설치하거나 매번 버전관리를 안해줘도 된다.

 2. starter를 통한 dependency 자동화
  스프링에서는 각각의 dependency들의 호환되는 버전을 일일이 맞춰야 했지만, 스프링부트에서는 starter가 관리로 version관리의 편리함.
 4. XML설정차이
 5. jar file을 이용해 자바 옵션만으로 쉽게 배포가능

<br>

## gradle
그냥 버전 설정하고 라이브러리 땡겨오는 것 정도만 이해

### build

콘솔로 접속
```shell
./gradle build # ./gradle clean build
cd build
cd libs
ls -arlth #jar 파일 확인

java -jar {snapshot.jar}
```

## Spring Bean

Spring Ioc 컨테이너가 관리하는 자바 객체를 Bean이라고 부릅니다.
Spring에서는 직접 new를 이용하여 객체를 생성하지 않고, Spring에 의하여 관리당하는 자바 객체를 사용합니다.

Spring에 의하여 생성되고 관리되는 자바 객체를 Bean이라고 합니다.

생성자 주입이 가장 좋다고 한다.

### Bean 장점
- 의존성 관리 용의
- Bean에 등록된 객체는 기본적으로 싱글톤으로 정해진다.
- 라이프 사이클 인터페이스를 지원해준다.

### Spring Bean을 등록하는 방법

#### 1. Annotation을 사용하는 방법
Annotation은 자바 소스 코드에 추가하여 사용할 수 있는 메타데이터의 일종입니다.
소스코드에 추가하면 단순 주석의 기능을 하는 것이 아니라 특별한 기능을 사용할 수 있습니다.

Spring에서는 여러 가지 Annotation을 사용하지만, Bean을 등록하기 위해서는
<span style="color:lime">@Component Annotation</span>을 사용합니다.

@Component Annotation이 등록이 되어있는 경우에는 Spring이 Annotation을 확인하고 자동으로 Bean으로 등록합니다.
(메인패키지경로 설정을 주의 하셔야 합니다.)

**@Component Annotation종류**
- @Controller
- @Service
- @Repository

#### 2. Bean Configuration File에 직접 등록하는 방법

@Configuration 과 @Bean Annotation을 사용하여 Bean을 등록할 수 있습니다.

@Configuration을 이용하면 Spring Project에서의 Configuration을 하는 Class를 지정합니다.
해당 File 하위에 Bean으로 등록하고자 하는 Class에 @Bean을 사용해주면 간단하게 등록이 됩니다.





## Spring MVC
Model, View, controller로 구분하되, model에서 DAO, DTO, Service로 나뉩니다.


### MVC구조 데이터흐름
1. REST API에 의해서 URL호출받음
2. Controller가 요청사항 파악
3. 상속받고 있는 서비스가 비즈니스 로직을 수행
4. 서비스는 해당 로직을 처리하기 위해 DAO에 메소드를 호출
5. DAO는 DB에 접근해서 데이터를 조작한 뒤 쿼리결과를 다시 서비스에 전달
6. 다시 서비스는 View에게 데이터나 최종결과를 리턴
7. 달라진 View를 사용자에게 보여짐

### Controller
클라이언트에 요청이 들어오면, 해당 요청을 수행할 비즈니스 로직을 제어

### Service
세분화된 비즈니스 로직을 처리하는 객체
DAO로 DB에 접근한 뒤, DTO로 데이터를 전달받은 후 로직을 수행한 결과를 반환
### DAO (Data Access Object)
DB에 접근하는 객체
CRUD기능

### DTO (Data Transfer) or VO (Value Object)
각 계층간 데이터 교환을 위한 자바 객체
getter, setter만 보유

