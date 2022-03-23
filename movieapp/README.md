![파일_000](https://user-images.githubusercontent.com/36736904/156867877-a08bcaa2-3377-46ee-9499-f84eb028fc22.png)

## OOP
1. 어떤 객체가 필요한지 고민한다
2. 객체는 독립적인 존재가 아니다. 기능을 구현하기 위해 협력하는 공동체의 일원으로 봐라


## 도메인
> 정의: 문제를 해결하기 위해 사용자가 프로그램을 사용하는 분야

요구사항을 분석하는 초기단계 ~ 구현단계까지 객체라는 동일한 추상화 기법을 사용  
따라서 도메인을 구성하는 개념들이 객체와 클래스로 연결가능  
<br>

![파일_000 (1)](https://user-images.githubusercontent.com/36736904/156868445-44eab730-230e-45a7-b9a8-09128417a336.png)


#### [객체는 상태와 행동을 가지는 자율적인 존재](https://github.com/hanbi97/object/issues/5)
#### [객체의 협력](https://github.com/hanbi97/object/issues/6)
#### [추상클래스와 인터페이스](https://github.com/hanbi97/object/issues/7)
#### [상속과 다형성](https://github.com/hanbi97/object/issues/8)
#### [추상화와 유연성](https://github.com/hanbi97/object/issues/9)
#### [추상클래스와 인터페이스 간 트레이드오프 및 상속과 합성](https://github.com/hanbi97/object/issues/10)
#### [객체지향 패러다임의 핵심: 역할, 책임, 협력](https://github.com/hanbi97/object/issues/11)
#### [데이터 중심 설계의 문제점](https://github.com/hanbi97/object/issues/14)
#### [GRASP 패턴 - 책임 주도 설계 하는법](https://github.com/hanbi97/object/issues/15)
#### [책임설계 모르겠다면](https://github.com/hanbi97/object/issues/16)

<br>

|   | 정의  | 특징  |
| ------------ | ------------ | ------------ |
| 오버로딩  |   이름같은함수 인자랑 리턴값만 다른거 | 오버로딩한 메서드는 원래 메서드를 가리지 않아 둘 다 공존    |
| 오버라이딩  |  부모 메서드 자식이 상속해서 재정의 | 자식 메서드가 부모 메서드를 가리기 때문에 외부에서는 부모 메서드 사용 X  |

<br>

약간 궁금한거.  
Movie - Screening / Screening - Booking 1:N 관계인데 Movie에 Screening 담는게 없네 뒤에거도 마찬가지  
이거 맞는건가
