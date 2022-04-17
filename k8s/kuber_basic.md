## 📌쿠버네티스
쿠버네티스는 구글에서 개발한 컨테이너화된 워크로드와 서비스를 관리하기 위한 이식성, 확장 가능한 오픈소스 플랫폼입니다.

쿠버네티스는 선언적 구성과 자동화를 모두 용이하게 해줍니다.

쿠버네티스는 크고, 빠르게 성장하는 생태계를 가지고 있습니다.
(서비스 및 기술 지원 및 도구는 어디서나 쉽게 이용가능합니다.)

### K8s 표기
쿠버네티스( Kubernetes )는 그리스어로 키잡이를 뜻합니다.
K 와 s 사이에 8글자를 나타내는 약식 표기로 `K8s`라고도 합니다.

<br>

---

## 오케스트레이션 (Orchestration)

컨테이너는 가상 머신과 다르게 호스트 운영체제를 공유합니다. 그래서 가상머신에 비해 훨씬 더 가볍지만 가상 머신과 마찬가지로 실행 환경을 독립적으로 가져갈 수 있습니다.

가벼운 실행 환경을 가지기 때문에 쉽게 복제, 배포가 가능합니다. 이러한 컨테이너를 다수의 서버에서 여러 개를 실행시키는 데 체계적으로 관리하는 기술을 컨테이너 오케스트레이션이라고 합니다.
![](https://velog.velcdn.com/images/yoongyum/post/02903a2d-789d-470d-99f4-71c8148a10b3/image.png)

<span style="color: #FF4000">**쿠버네티스는 컨테이너의**

- 프로비저닝 및 배포 책임

- 이중화와 가용성 보장
- 수평확장/축소 관리
- 스케줄링
- 네트워크 설정
- 컨테이너 상태 모니터링
- 실행될 컨테이너를 기반으로 애플리케이션 설정

> 이미지 출처: [https://www.sharedit.co.kr/posts/12040](https://www.sharedit.co.kr/posts/12040)
  
<br>

---
  
## 바라는 상태 (Desired State)
	
쿠버네티스에는 "바라는 상태"라는 개념이 있습니다.
쿠버네티스는 사용자의 요청에 따라 **"현재 상태"**가 **"바라는 상태"**와 동일해지도록 수행합니다.
사용자가 자신이 원하는 애플리케이션 배포 상태를 쿠버네티스에 알려주면 쿠버네티스에서 자동으로 현재 상태를 바라는 상태로 변경합니다.
따라서 애플리케이션이 죽더라도 바라는 원래의 상태로 배포상태를 되살릴 수 있습니다.
**"바라는 상태"**란 사용자가 생각하는 최종 애플리케이션 배포상태를 말합니다.
  ![](https://velog.velcdn.com/images/yoongyum/post/51003326-7bcd-4bb4-998c-7c9df87bcc4b/image.png)
  >이미지 출처: [https://www.leverege.com/iot-ebook/kubernetes-object-management-model](https://www.leverege.com/iot-ebook/kubernetes-object-management-model)

  
  
<br>

---
  
  ## 🎮컨트롤러 (Controller)

쿠버네티스에서 컨트롤러는 클러스터의 상태를 관찰 한 다음, 필요한 경우에 생성 또는 변경을 요청하는 control-loop를 진행합니다. control-loop는 시스템 상태를 조절하는 종료되지 않는 루프입니다.
각 컨트롤러는 현재 클러스터 상태를 **"바라는 상태"**에 가깝게 하려고 합니다.

<br>  

---

## 🐳🐳파드 (POD)🐳🐳
![](https://velog.velcdn.com/images/yoongyum/post/23972ba4-32da-44d2-b7ef-c0d53fdaa69d/image.png)

파드(Pod) 는 쿠버네티스에서 생성하고 관리할 수 있는 배포 가능한 가장 작은 컴퓨팅 단위입니다.
`고래 떼(pod of whales)`에서 이름을 따온 것 같습니다. 앞에 의미처럼 파드는 하나 이상의 컨테이너 그룹입니다.
> 쿠버네티스는 도커 외에도 다양한 컨테이너 런타임을 지원합니다.

아무리 작고 단순한 하나의 프로세스를 실행하더라도, Pod를 통해 수행됩니다. k8s는 파드를 통해 기본 가상환경을 제공합니다.
  pod 속 컨테이너 간에는 서로 리소스를 공유할 수 있습니다.

#### 가상환경 플랫폼 실행단위
- 가상머신 : Instance
- 도커 : Container
- 쿠버네티스 : Pod

>이미지 출처 : [https://kubernetes.io/ko/docs/tutorials/kubernetes-basics/explore/explore-intro/](https://kubernetes.io/ko/docs/tutorials/kubernetes-basics/explore/explore-intro/)
  
<br>

---
  
## 📋YAML
쿠버네티스에서는 선언형 커맨드를 지향합니다.
리소스(오브젝트)를 생성하기 위해 사용자는 선언형 명령으로 `YAML` 혹은 `JSON`을 사용하며 일반적으로 `YAML`이 편리해 많이 사용합니다.
그렇다면, `YAML`이란 무엇인가?
  
"YAML은 마크업 언어가 아니다 (YAML Ain't Markup Language)” 라는 재귀적인 이름에서 유래되었습니다.
`YAML`은 XML, C, Python, Perl, RFC2822 에서 정의된 개념을 기반으로 만들어진 사람이 읽고 쓰기 쉽게 데이터를 정의하는 양식입니다.
  
### YAML형식 예시
```yml
apiVersion: v1
kind: Pod
metadata:
  name: myweb-pod
  labels:
  	app: myweb
  	type: fronted
spec:
  containers:
  - name: nginx-container
  	image: nginx
```
  
  

<br>  

---  
  
  
## 💼네임스페이스 (Namespace)
  
쿠버네티스에서 네임스페이스는 단일 클러스터 내에서 리소스 그룹 격리 메커니즘을 제공합니다.
쿠버네티스에서 모든 리소스는 이름(Name)을 갖고있습니다.
리소스의 이름은 네임스페이스 내에 유일해야하며, 네임스페이스 간에서 유일할 필요는 없습니다.
  
쿠버네티스에서 모든 리소스를 크게 두 가지로 나누자면 네임스페이스 레벨 리소스와 클러스터 레벨 리소스로 나눌수 있습니다.
  
- 네임스페이스 레벨 리소스
  특정 네임스페이스 안에 존재합니다. Pod, Deployment, Service와 같이 대부분의 쿠버네티스 리소스가 네임스페이스 안에 포함됩니다.

- 클러스터 레벨 리소스
 Node, PersistentVolume, StorageClass와 같이 네임스페이스 영역에 상관없이 클러스터 레벨에서 존재하는 리소스도 있습니다.
  
네임스페이스는 사용자가 원하는대로 자유롭게 추가, 삭제가 가능합니다.
 
<br>
  

---

## 🔱클러스터 아키텍처
![](https://velog.velcdn.com/images/yoongyum/post/f0fc44d4-5878-4877-b4c0-deee220dee59/image.png)


쿠버네티스는 크게 마스터(Master) 노드(Node) 두 개의 컴포넌트로 분리됩니다.
마스터를 `컨트롤플레인`이라고 이해하시면 됩니다.

클러스터(Cluster)란 마스터 및 하나 이상의 컴퓨팅 머신 또는 노드로 구성된 아키텍처라고 생각합니다.

<br>

### 마스터 📢 

컨트롤플레인(Control Plane)이라고 불리기도 하는 마스터(Master)는 쿠버네티스의 클러스터 전체를 컨트롤 하는 시스템입니다. 단일한 서버로 구성할 수 있으며, 고가용성을 위해 여러서버를 묶어 클러스터 마스터로도 구축할 수 있습니다.
  아래는 마스터를 구성하는 요소들입니다.

- <span style="color: #9A2EFE">**kube-apiserver (API 서버)**
  
  #####  - 마스터로 전달되는 모든 요청을 받아 드리는 REST_API서버
  
  #####  - 위 이미지에서 보이는 것처럼  api 서버는 쿠버네티스의 핵심역할을 담당하여 중심에서 다른 모든 컴포넌트에서 오는 이벤트를 받아들이고 응답 또는 요청
  #####  - 사용자도  kubelet을 통해서 api서버와 통신
  #####  - 마스터와 통신한다는 뜻은 api서버와 통신한다는 의미


  
- <span style="color: #9A2EFE">**etcd (저장소)**
  #####  - 쿠버네티스 클러스터에 존재하는 모든 데이터를 저장하는 DB
  
  #####  - RDB가 아닌 분산형 **일관성/고가용성** `key-value` 형태 저장소
  #####  - api서버 백엔드에 위치하여 필요한 데이터 제공 및 중요한 데이터 저장
  


- <span style="color: #9A2EFE">**kube-scheduler (컨테이너 스케줄러)**
  #####  - 노드가 배정되지 않은 새로 생성된 포드를 감지하고, 실행할 워커노드를 선택
  #####  - 쉽게 말해 여유있는 서버를 찾아 적절한 컨테이너에 배치
  
  #####  - 클러스터의 전반적인 스케줄링을 수행
  

  
- <span style="color: #9A2EFE">**kube-controller-manager (컨트롤러 집합)**
  #####  - 컨트롤러 프로세스 실행
  
  #####  - 현재 상태와 바라는 상태를 지속적으로 확인하며 특정 이벤트에 따라 특정 동작을 수행
  #####  - 전반적인 리소스사이클을 관리
  #####  - 리소스별로 리소스컨트롤러가 존재하는데, 이러한 컨트롤러를 하나로 합친 것


  
- <span style="color: #9A2EFE">**cloud-controller-manager (클라우드 컨트롤러)**

  #####  - 클라우드플랫폼(AWS, GCP, AZURE 등)에 특화된 리소스 제어
  
  #####  - 노드가 응답을 멈춘 후 클라우드에서 삭제 되었는지 판별
  #####  - 기본 클라우드 인프라에 경로 구성
  #####  - 클라우드 제공 사업자 로드밸런서 생성, 업데이트, 삭제
  
<br>

---

### 노드 ⛑ 
노드는 마스터로부터 명령을 받아 실제 워크로드를 생성하는 컴포넌트입니다.

- <span style="color: #FF00BF">**kubelet (노드 관리자)**</span>
  
 ##### - 클러스터 각 노드에서 실행되는 에이전트
 ##### - 마스터와 노드간 필요한 정보교환
 ##### - 마스터에게 파드 스펙(PodSpec)을 받아 특정 컨테이너가 명세에 따라 동작하게 모니터링
 


- <span style="color: #FF00BF">**kube-proxy (네트워크 프록시)**</span>
  #####  - 각 노드에서 쿠버네티스 서비스 네트워킹을 책임
  #####  - 노드의 네트워크 규칙을 관리하고 규칙이 내/외부의 트래픽을 pod로 전달할 수 있도록 패킷을 라우팅
  

- <span style="color: #FF00BF">**container runtime (컨테이너 실행 환경)**</span>
  #####  - 실제 컨테이너를 실행시키는 실행환경
  #####  - 도커 뿐만 아니라 [Kubernetes CRI] (https://github.com/kubernetes/community/blob/master/contributors/devel/sig-node/container-runtime-interface.md) 규약을 따른다면 어떠한 런타임도 실행환경으로 사용가능

  <br>

---  
  
### 애드온 🧰 
애드온은 쿠버네티스 리소스를 이용하여 클러스터 기능을 구현합니다.

아래는 일부 애드온입니다.
  - <span style="color: #04B4AE">**DNS**</span>
  ##### - 쿠버네티스는 파드와 서비스를 위한 DNS 레코드를 생성
  ##### - 쿠버네티스 DNS는 클러스터의 서비스와 DNS 파드를 관리
  ##### - 클러스터 내의 모든 서비스(DNS 서버 자신도 포함하여)에는 DNS 네임이 할당
- <span style="color: #04B4AE">**Web UI (대시보드)**</span>
  ##### - 대시보드는  쿠버네티스 클러스터를 위한 법용 웹 기반 UI
  ##### - 사용자가 클러스터 자체 뿐만 아니라, 클러스터에서 동작하는 애플리케이션 관리와 문제 해결을 도움
- <span style="color: #04B4AE">**container resource monitoring**</span>
  ##### - 중앙 데이터베이스 내의 컨테이너들에 대한 포괄적인 시계열 매트릭스를 기록
  ##### - 데이터를 열람하기 위한 UI 제공
- <span style="color: #04B4AE">**cluster-level logging**</span>
  ##### - 클러스터-레벨 로깅 메커니즘은 검색/열람 인터페이스와 함께 중앙 로그 저장소에 컨테인 로그를 저장하는 책임을 짐

  <br>
  
> 이미지 출처 : https://kubernetes.io/ko/docs/concepts/overview/components/
