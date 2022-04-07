# 도커 기초 #1

# 도커 설치

```bash
$ sudo apt update && sudo apt install -y docker.io net -tools
$ sudo usermod -aG docker $USER

$ sudo reboot
```

# 도커 기본 명령

## 컨테이너 실행

```bash
$ docker run docker/whalesay cowsay 'hello world'
```

```bash
$ docker run -d nginx
```

## 컨테이너 조회

```bash
$ docker ps     #현재 실행 중인 컨테이너 조회
$ docker ps -a  #중단된 컨테이너까지 조회
```

## 컨테이너 상세정보

```bash
$ docker inspect <CONTAINER_ID>
```

## 컨테이너 로깅

```bash
$ docker logs <CONTAINER_ID>
```

## 컨테이너 명령 전달

```bash
$ docker exec <CONTAINER_ID> <CMD>
```

## 컨테이너 / 호스트간 파일 복사

```bash
$ docker cp <HOST_PATH> <CONTAINER_ID>:<CONTAINER_PATH>
```

## 컨테이너 중단

```bash
$ docker stop <CONTAINER_ID>
```

## 컨테이너 재개

```bash
$ docker start <CONTAINER_ID>
```

## 컨테이너 삭제

```bash
$ docker rm <CONTAINER_ID>
```

## Interactive 컨테이너

```bash
$ docker run -it ubuntu:16.04 bash

$ exit    #컨테이너 빠져나오기
```

이미 실행 중인 컨테이너 내부에 접속

```bash
$ docker exec -it <CONTAINER_ID> bash
```
