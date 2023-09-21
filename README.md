## PyLike 라이브러리


#### 1. 개요
<br/>

> python lover들을 위한 라이브러리

PyLike 라이브러리는 python lover들을 위한 라이브러리 입니다.
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
물론 언어 특성상 완전히 동일하게 구현할 수는 없었습니다만 최대한 유사하게 만들었습니다. 
혹시 오류나 버그를 발견하시면 언제든지 지적 해주시면 좋을 것 같습니다.
<br/>
<br/>
<br/>

#### 2. 설명
> Java를 pythonic하게 !!

Java의 Collection Framework를 python의 기본 자료형처럼 사용하기 위해서 만들어진 라이브러리 입니다.
python의 기본 자료형인 list, set, dictionay, string의 메서드와 동일한 이름과 기능을 구현하여
python을 이미 알고 있다면 Java의 Collection Framework도 문제 없이 다룰 수 있도록 하였습니다.  
<br/>
PyLike는 다음과 같은 장점이 있습니다.
<br/>
- 최대한 `pythonic`한 코드 작성이 가능하도록 하였습니다.
- `Python과 동일한 메서드명`으로 Java의 Collection Framework를 다룰 수 있습니다.
    - (구현 상 완전히 동일하게 할 수 없는 메서드의 경우 약간 상이할 수 있습니다.)
- Python의 `type unsafe` 장점을 Java에서도 일부분 느낄 수 있습니다. 
- Python의 직관적이고 간결한 내장함수(Built-in Functions)를 Java에서도 사용할 수가 있습니다.
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

#### 4. 사용법 및 예시

- 자세한 활용법은 https://pebble-noise-a5e.notion.site/PyLike-7cb9c7b338fc41e7a1f20794b77c953a?pvs=4 에서 확인해주세요

<br/>
[예시1] 

- python 코드

    ```python
    for i in range(1,11):
    		print(i)
    ```


- PyLike 코드

    ```java
    for (int i : Pl.range(1,11)) {
    		Pl.print(i);
    }
    ```
<br/>
[예시2] (programmers) 크기가 작은 부분문자열

- python 코드

    ```python
    def solution(t, p):
        length = len(p)
        cnt = 0
    
        for i in range(length,len(t)+1):
            if t[i-length:i] <= p:
                cnt += 1
        
        return cnt
    ```

- PyLike 코드

    ```java
    public static int solution(String t, String p) {
        int length = Pl.len(p);
        int cnt = 0;
    
        for (int i : Pl.range(length, Pl.len(t)+1) ){
            String str = Pl.slicing(t, i - length, i);
            if (str.compareTo(p) <= 0)
                cnt += 1;
        }
        return cnt;
    }
    ```
<br/>
[예시3] (Programmers) 과일 장수

- python 코드

    ```python
    def solution(k, m, score):
    
        score.sort()
        price = 0
        length = len(score)
    
        start_point = length % m
    
        while start_point < length:
            price += score[start_point] * m
            start_point += m
    
        return price
    ```

- PyLike 코드

    ```java
    public int solution2(int k, int m, int[] score) {
    
        List<Integer> li = Pl.list(score);
    
        Pl.sort(li);
        int price = 0;
        int length = Pl.len(li);
    
        int start_point = length % m;
    
        while (start_point < length) {
            price += Pl.get(li,start_point) * m;
            start_point += m;
        }
        return price;
    }
    ```