# Dockerfile

<br>

## From
어느 이미지에서 시작할건지를 의미한다.

<br>

## LABEL
이미지에 메타데이터를 추가 (key-value 형태)

<br>

## RUN
새로운 레이어에서 명령어를 실행하고, 새로운 이미지를 생성한다.
- RUN 명령을 실행할 때 마다 레이어가 생성되고 캐시된다.
- RUN 명령을 따로 실행하면 apt-get update는 다시 실행되지 않아서 최신 패키지를 설치할 수 없다.
- RUN명령어 하나에 apt-get update와 install을 함께 실행하는게 좋다.

<br>

## WORKDIR
작업 디렉토리를 지정한다. (디렉토리가 없으면 새로 생성)
- 디렉토리를 지정하면 그 이후 명령어는 해당 디렉토리를 기준으로 동작한다.
- cd 명령어와 동일하다.

<br>

## EXPOSE
Dockerfile의 빌드로 생성된 이미지에서 열어줄 포트를 의미한다.
- 호스트 머신과 컨테이너의 포트 매핑시에 사용된다.
- 컨테이너 생성 시 -p 옵션의 컨테이너 포트 값으로 EXPOS값을 적어야한다.

<br>

## USER
이미지를 어떤 계정에서 실행 하는지 지정
- Default로 root

<br>

## CMD / ENTRYPOINT
컨테이너를 생성, 실행 할 때 실행할 명령어
- docker run명령으로 컨테이너를 생성하거나, docker start을 사용할 때 실행된다.

<br>

#### CMD 
CMD command param1 param2
- 실행할때 입력한 명령어로 override가 가능하다.

#### ENTRYPOINT
ENTRYPOINT command param1 param2
- 실행할때 추가적인 명령어가 있어도 override되지 않는다.

<br>

## COPY / ADD
build명령 중간에 호스트 파일 또는 폴더를 이미지에 가져오는 것
- ADD 명령문은 일반파일 뿐만 아니라 압축파일이나 네트워크 상의 파일도 사용할 수 있다.
- 특수한 파일을 다루는 게 아니라면 COPY를 사용

<br>

## ENV
이미지에서 사용할 환경 변수 값을 지정한다.
