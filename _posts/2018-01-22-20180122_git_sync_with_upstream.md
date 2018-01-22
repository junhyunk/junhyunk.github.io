---
layout: post
comments: true
title: GitHub에서 fork한 저장소와 sync 맞추기
description: GitHub에서 fork한 저장소와 sync 맞추기
header: GitHub에서 fork한 저장소와 sync 맞추기
---

다른 저장소를 fork하여 소스코드를 수정하고자 하는 경우에 원본 저장소와 sync를 맞추는 방법입니다.

현재 진행하는 기술교육 프로젝트와 같이, 본인이 저장소에 Collaborator로 등록되어 있을 경우 별도로 fork하지 않아도 commit, push, merge 할 수 있는 권한을 갖습니다. 그러나 Collaborator로 등록되지 않은 다른 저장소에 기여하고 싶은 경우, 해당 저장소를 fork하여 자신의 저장소로 등록하고 수정한 결과에 대해 Pull Request를 보냅니다.

기여하고자 하는 원본 저장소를 upstream이라 하고, 이를 fork한 제 저장소를 origin이라 하겠습니다. origin/master에서 열심히 수정한 사항을 upstream/master에 반영하려 하는데, 제가 수정하는 동안 upstream의 관리자들도 열심히 일했는지 처음 fork했을 때보다 upstream/master에 몇 번의 commit이 더 반영되어 있는 상황입니다.

1. 제가 수정한 브랜치를 반영하려면 최신 버전의 upstream 브랜치가 필요합니다. 우선 origin을 클론한 제 로컬 저장소에서 저장소 목록을 확인해 보겠습니다.
```sh
$ git remote -v
origin  https://github.com/junhyunk/forked_repo.git (fetch)
origin  https://github.com/junhyunk/forked_repo.git (push)
```
2. 저장소에는 별다른 작업을 하지 않았으므로, 제 저장소인 origin만이 지정되어 있는 것을 확인할 수 있습니다. 이제 원본 저장소인 upstream을 추가하고, 다시 저장소 목록을 확인해 보겠습니다.
```sh
$ git remote add upstream https://github.com/otheruser/original_repo.git
$ git remote -v
origin  https://github.com/junhyunk/forked_repo.git (fetch)
origin  https://github.com/junhyunk/forked_repo.git (push)
upstream https://github.com/otheruser/original_repo.git (fetch)
upstream https://github.com/otheruser/original_repo.git (push)
```

3. upstream 저장소를 로컬에 등록했으니, git fetch 명령어로 원본 저장소의 최신 내용을 받아올 수 있게 되었습니다 :)
```sh
$ git fetch upstream
```

4. 이제 제가 열심히 작업한 master 브랜치로 이동하고, upstream/master를 현재 브랜치에 merge합니다.
```sh
$ git checkout master
$ git merge upstream/master
```

5. Pull Request를 보내기 앞서, 현재까지 수정한 내용을 origin에 push합니다.
```sh
$ git push origin master
```

6. 심호흡을 하고 Pull Request를 보냅니다.

---

* 참고자료
    * https://help.github.com/articles/configuring-a-remote-for-a-fork
    * https://help.github.com/articles/syncing-a-fork/
