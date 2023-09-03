# JAVA
<div>
# 변수
데이터를 저장하고 관리하는 데 사용되는 기본적인 개념입니다. 변수는 이름을 가지며, 해당 이름을 사용하여 값을 저장하고 검색할 수 있습니다. 변수는 프로그램 내에서 데이터를 임시로 보관하거나 처리하는 데 사용됩니다.

# 변수 규칙

##### 유효한 문자 : 변수 이름은 문자, 숫자, '_', $,로 구성될 수 있습니다. 하지만 변수 이름은 문자로 시작해야 하며, 숫자로 시작해서는 안 됩니다.
##### 대소문자 구분 : 변수 이름은 대소문자로 구분합니다. 'myVariable'과 'myvariable'은 다른 변수 이름으로 간주됩니다.
##### 예약어 사용 금지 : 자바에서 사용되는 예약어는 변수 이름으로 사용할 수 없습니다. 이러한 예약어는 자바 언어에서 특별한 역할을 수행하는 단어들이며, 변수 이름으로 사용하면 안 됩니다.
##### 의미 있는 이름 사용 : 변수  이름은 해당 변수의 역할이나 의미를 잘 나타내도록 지어야 합니다. 이렇게 하면 코드를 읽거나 유지보수할 때 변수의 용도를 파악하기 쉬워집니다.
##### 카멜 케이스 사용 : 변수 이름이 여러 단어로 이루어진 경우, 카멜 케이스를 사용하는 것이 관례입니다. 카멜 케이스는 첫 단어를 소문자로 시작하고, 그다음 단어부터는 각 단어의 첫 글자를 대문자로 적는 방식입니다.
##### 네이밍 관습 준수 : 프로그래밍 커뮤니티에서는 일반적으로 변수 이름을 작성할 때 일정한 네이밍 관습을 따르는 것이 좋습니다.
##### 기본 데이터 타입

# 정수형
##### byte : 8비트 부호 있는 정수. 작은 범위의 정수 값을 저장할 때 사용됩니다.
##### short : 16비트 부호 있는 정수. byte 보다 큰 범위의 정수 값을 지정할 때 사용됩니다.
##### int : 32비트 부호 있는 정수. 가장 일반적으로 사용되는 정수형 데이터 타입입니다.
##### long : 64비트 부호 있는 정수. 더 큰 범위의 정수 값을 저장할 때 사용됩니다.

# 실수형
##### float : 32비트 부동 소수점. 단정도 형식. 단정도 형식으로, 대략 7자리의 유효 숫자를 표현할 수 있습니다.
##### double : 64비트 부동 소수점. 배정도 형식. 기본적으로 실수 값은 double로 인식됩니다. 배정도 형식으로, 대략 15자리의 유효 숫자를 표현할 수 있습니다.

# 문자형
##### char : 16비트 유니코드 문자를 나타내는 부호 없는 16비트 데이터 타입입니다. 크기가 작아서 정수형처럼 값을 연산하는 데 사용되기도 합니다. 그러나 문자열을 처리할 때는 String클래스를 사용하는 것이 편리합니다.

# 논리형
##### boolean : 논리적인 true 또는 false를 나타내는 타입입니다. 조건문에서 사용하여 코드의 흐름을 제어하거나 논리 연산을 수행할 때 주로 활용됩니다. boolean 데이터 타입은 조건을 검사하거나 스위치문과 같은 흐름 제어 구조에서 사용될 때 매우 유용합니다.
##### 참조변수
객체를 가리키는 변수를 의미합니다. 이 변수는 실제 데이터를 직접 포함하지 않고, 대신 해당 데이터가 저장된 메모리 주소를 가리킵니다. 참조 변수를 사용하여 객체에 접근하고 조작할 수 있습니다.


String 클래스의 인스턴스를 생성하고 해당 인스턴스에 대한 참조 변수를 만드는 코드입니다.

    String message = new String("Hello, world!");

# 변수 코드

    public class  variables {
    public static void main(String[] args) {
# 여러개 문자를 사용하기 위한 String
String name = "자바";
# 정수형 변수
    int hour = 15;
    
    System.out.println(name +"님 배송이 시작됩니다."+ hour + "시 방문 예정입니다.");
    System.out.println(name +"님 배송이 완료되었습니다.");

# 실수값
double score = 90.5;

# 하나의 문자열 사용할때는 char
    char grade = 'A';
    name = "강백호";//값을 업데이트 할 수 있다.
    System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
    System.out.println("학점은" + grade + "입니다.");

# 참과 거짓  boolean
boolean pass = true; // true 또는 false 값을 가집니다.
System.out.println("이번 시험에 함격했을까요?" + pass);

# 실수를 표현 변수
double d = 3.14123456789;  //모든 소수점 자리 나옮 (정밀한 계산가능)
float f = 3.14123456789F; // 6까지 만 출력

    System.out.println(d);
    System.out.println(f);

# long 형 자료형 변수
int로 숫자가 길때 long 변수 사용 (int 범위 -21억~+21억 ) 그 이상이면 long 함수 사용
long l = 1000000000000l;
l=1_000_000_000_000l;
System.out.println(l);
}
</div>
