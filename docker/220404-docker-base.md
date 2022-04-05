# 도커 기초

# 도커 설치
```
$ sudo apt update && sudo apt install -y docker.io net -tools
$ sudo usermod -aG docker $USER

$ sudo reboot
```

# 도커 기본 명령

## 컨테이너 실행
```
$ docker run docker/whalesay cowsay 'hello world'
```

```
$ docker run -d nginx
```

## 컨테이너 조회
```
$ docker ps
```
## 컨테이너 상세정보

```
$ docker inspect <CONTAINER_ID>
```

## 컨테이너 로깅

```
$ docker logs <CONTAINER_ID>
```

## 컨테이너 명령 전달
```
$ docker exec <CONTAINER_ID> <CMD>
```

## 컨테이너 / 호스트간 파일 복사

```
$ docker cp <HOST_PATH> <CONTAINER_ID>:<CONTAINER_PATH>
```

## 컨테이너 중단
```
$ docker stop <CONTAINER_ID>
```
```


