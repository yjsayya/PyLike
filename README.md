## PyLike 라이브러리


#### 1. 개요
> python lover들을 위한 라이브러리

PyLike 라이브러리는 Java 공부를 해야하지만 하기 귀찮은 python lover들을 위한 라이브러리 입니다.
<br/>
<br/>
python에 익숙하신 분들은 아마 Java가 너무 복잡하다고 느껴본 적이 있을 것입니다.
저도 Java 공부를 하면서 python과 달리 Java Collection Framework의 복잡한 상속 관계가 불편하다고 느낀적이 많습니다.
또한 python과 메서드명이 달랐던 것도 굉장히 답답하다고 느낀 적이 많았습니다.
그 때 이 세상 모든 언어의 메서드명이과 동작 원리가 동일하면 참 좋을 것 같다는 생각을 했습니다.
그러면 다른 언어를 배우는 것이 굉장히 쉬울텐데 말이죠
<br/>
<br/>
그렇게 PyLike를 만들게 되었습니다. 모든 언어는 안되겠지만 적어도 제가 아는 python과 Java의 메서드는 좀 비슷하면 좋을 것 같았습니다.
물론 언어 특성상 완전히 동일하게 구현할 수는 없었습니다만 나름 유사하게 만들었습니다. 
혹시 오류나 버그를 발견하시면 언제든지 지적 해주시면 좋을 것 같습니다.
<br/>
<br/>
<br/>

#### 2. 설명
> Java를 pythonic하게 !!

Java의 Collection Framework를 python의 기본 자료형처럼 사용하기 위해서 만들어진 라이브러리 입니다.
python의 기본 자료형인 list, set, dictionay, string의 메서드와 동일한 이름과 기능을 구현하여
python을 이미 알고 있다면 Java의 Collection Framework도 문제 없이 다룰 수 있도록 하였습니다.  
PyLike는 다음과 같은 장점이 있습니다.
<br/>
- `Python과 동일한 메서드명`으로 Java의 Collection Framework를 다룰 수 있습니다.
    - (구현 상 완전히 동일하게 할 수 없는 메서드의 경우 약간 상이할 수 있습니다.)
- Python의 `타입을 강제하지 않는 특징`을 살리기 위해서 나름 노력했습니다.
- 최대한 `pythonic`한 코드 작성이 가능하도록 하였습니다.
<br/>
<br/>
<br/>

#### 3. 설정

build.gradle 파일에 다음 코드를 추가하고 빌드해주세요
```build.gradle
allprojects {
  repositories {
      ...
      maven { url 'https://jitpack.io' }
  }
}


dependencies {
    implementation 'com.github.yjsayya:PyLike:0.0.2'
}
```
<br/>
<br/>
<br/>

#### 4. 사용법 및 예시

- 자세한 활용법은 https://pebble-noise-a5e.notion.site/PyLike-7cb9c7b338fc41e7a1f20794b77c953a?pvs=4 에서 확인해주세요