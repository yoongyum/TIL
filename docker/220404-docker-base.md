# 도커 기초

## 도커 설치
```
$ sudo apt update && sudo apt install -y docker.io net -tools
$ sudo usermod -aG docker $USER

$ sudo reboot
```

## 도커 기본 명령

### 컨테이너 실행
---
```
$ docker run docker/whalesay cowsay 'hello world'
```


