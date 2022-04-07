# .gitignore
```
어떤파일이나 폴더 등을 추적하지 않도록 명시하기
디렉토리의 경우 secrets/**
*.pem
auth.*

```

# username.github.io
```
저장소를 활용해 정적인 사이트 호스팅 가능
```

# Branch 
```bash
기점은 생성하여 독립적으로 코드 변경해주게 만듬
git branch : 브랜치 리스트를 보여줌
git branch [name] : 브랜치를 생성
git switch [branch명] : 원하는 브랜치로 이동
git merge [branch명] : 현재 위치와 브랜치를 합병함
git branch -D [branch명] : 브랜치명과 같은 것을 삭제
```
# branch model
```bash
git flow 
(hotfix)-master-(release)- develop-feature

github flow
master - feature

gitlab flow 
production - pre-production - master - feature

```

# git flow init

```bash
git flow feature start [name]
git flow feature finish [name]
git flow release start v0.0.0 맨앞이 0이면 베타버전 1이상부터 정식버젼
git push --tag
```

