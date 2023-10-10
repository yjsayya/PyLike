## PyLike

PyLike는 `Spring Boot에서 사용할 수 있는 오픈소스 라이브러리`입니다

 - Java의 Collection Framework의 python에 비해 사용하기 불편합니다.
 - 상속관계가 복잡하기 때문에 메서드의 소속 객체를 외워야 사용이 가능합니다.
 - Java에서도 python의 내장함수와 iterable 객체처럼 메서드명으로만 사용하고 싶었습니다.

<br/>

#### 1. 설명

> Java를 pythonic하게 !!

python의 장점을 Java에 이식하여 Java를 보다 간결하고 깔끔한 코드를 작성할 수 있도록 PyLike를 제작하였습니다.

- Java에서도 `pythonic`한 코드 작성이 가능합니다.
- Python의 직관적이고 간결한 내장함수(Built-in Functions)를 Java에서도 사용 가능합니다.
- Python처럼 Java Collection Framework를 기본 자료형처럼 다룰 수 있습니다.
- Python과 동일한 메서드명으로 Java의 Collection Framework를 사용할 수 있습니다.
- Collection Framework의 상속 구조를 몰라도 됩니다.

<br/>

#### 2. 설정 방법

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

#### 3. 사용법 및 예시

PyLike - 내장 함수
- Pl.abs() - 절댓값
- Pl.divmod() - 몫,나머지
- Pl.input() - 입력
- Pl.int() - int로 바꾸기
- Pl.float() - float으로 바꾸기
- Pl.len() - 길이 구하기
- Pl.max() - 최댓값 구하기
- Pl.min() - 최솟값 구하기
- Pl.pow() - 제곱 값 구하기
- Pl.range() - 반복 객체 가능한 list 만들기
- Pl.print() - 출력
- Pl.sorted() - 정렬
- Pl.sum() - 총합 구하기
- Pl.in() - 포함 관계 확인하기(1)
- Pl.not_in() - 포함 관계 확인하기(2)

<br/>
자세한 활용법은 https://pebble-noise-a5e.notion.site/PyLike-7cb9c7b338fc41e7a1f20794b77c953a?pvs=4 에서 확인해주세요
<br/>
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