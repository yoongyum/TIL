# web

## 1. WWW (World Wide Web, W3)
인터넷에서 연결된 컴퓨터를 통해 사람들이 정보를 공유할 수 있는 전 세계적인 정보 공간을 말합니다.

### 1.1 Web Site
google, naver, daum, facebook 등 HTML로 구성된 여러 사이트들

### 1.2 API (Application Programming Interface) * Web Service
KaKao Open API, Google Open API, Naver Open API 등

### 1.3 User Interface
Chrome, Safari, Explorer, Smart Watch, IP TV 등


## WEB의 기본 3가지 요소

### URI (Uniform Resource Identifier)
리소스 식별자
- 특정 사이트
- 특정 쇼핑목록
- 동영상 목록

모든 정보에 접근 할 수 있는 정보

<br>

### HTTP (Hypertext Transfer Protocol)
RFC 2616에서 규정된 Web에서 데이터를 주고 받는 프로토콜

HTTP는 TCP를 기반으로 REST의 특징을 모두 구현하고 있는 web기반의 프로토콜

HTTP는 메시지를 주고 받는 형태의 통신 방법입니다.

<br>

#### HTTP의 요청을 특정하는 METHOD 8가지

| |의미|CRUD|멱등성|안정성|Path Variable| Query Parameter| DataBody|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|**GET**|리소스 취득| R| O |O|O|O|X|
|**POST**|리소스 생성, 추가|C|X|X|O|△|O|
|**PUT**|리소스 갱신, 생성|C / U|O|X|O|△|O|
|**DELETE**|리소스 삭제|D|O|X|O|O|X|
|**HEAD**|헤더 데이터 취득|-|O|O|-|-|-|
|**OPTIONS**|지원하는 메소드 취득|-|O|-|-|-|-|
|**TRACE**|요청하는 반환|-|O|-|-|-|-|
|**CONNECT**|프록시 동작의 터널 접속으로 변경|-|X|-|-|-|-|


#### HTTP Status Code
응답의 상태를 나타내는 코드

**1xx** (처리중) : 처리가 계속 되고 있는 상태. 클라이언트는 요청을 계속하거나 서버의 지시에 따라서 재요청

**2xx** (성공) : 요청의 성공

**3xx** (리다이렉트) : 다른 리소스로 리다이렉트. 해당 코드를 받았을 때는 Response의 새로운 주소로 다시 요청

**4xx** (클라이언트 에러) : 클라이언트의 요청에 에러가 있는 상태. 재전송 하여도 에러가 해결되지 않음.

**5xx** (서버에러) : 서버 처리중 에러가 발생한 상태. 재 전송시 에러가 해결 되었을 수도 있다.

<br>

#### 자주 사용되는 코드
200 : 성공
201 : 성공. 리소스를 생성 성공
301 : 리다이렉트, 리소스가 다른 장소로 변경됨을 알림
303 : 리다이렉트, Client에서 자동으로 새로운 리소스로 요청 처리
400 : 요청 오류, 파라미터 에러
401 : 권한 없음 (인증실패)
404 : 리소스 없음 (페이지를 찾을 수 없음)
500 : 서버 내부 에러 (서버 동작 처리 에러)
503 : 서비스 정지 (점검 등등)

### HTML (Hyper Text Markup Language)
하이퍼미디어 포맷

XML을 바탕으로한 범용 문서 포맷

이를 이용하여 chrome, safari, explorer에서 사용자가 알아보기 쉬운 형태로 표현