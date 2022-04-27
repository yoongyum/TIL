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

### IoC (Invertion Of Control) : 제어 역행
객체 생성과 소멸등 전반적인 관리를 프레임워크의 컨테이너가 대신 하는 것을 의미한다.
Spring에서는 객체(Object)를 Bean이라고 한다.

### AOP (Apect-Oriented Programming) : 관점지향 프로그래밍
관점지향은 어떤로직을 기준으로 핵심적인 관점, 부가적인 관점으로 나누어서 보고 그 관점을 기준으로 각각 모듈화 하겠다는 것입니다.


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