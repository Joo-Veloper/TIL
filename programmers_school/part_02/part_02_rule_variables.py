#변수이름 정하는 규칙

#시작을 숫자로 하면 안됨!!
num_7=0 #이런식으로 시작
#빈칸 xxx
#number of legs=0(x)
number_of_legs=0 #sanke_case - python
NumberOfLegs=0 #capWord,CamelCase-python class
nubmerOfLegs=0#mixedCase

#소문자 대문자
# 변하지 않는 값 대문자 변할값 소문자
GRAVITY=9.8
name="머쓱이"
age=10

#한글 변수 UTF파일로 한글 가능
name="스팬서"
age=99
print(name,age)

#특수문자 _허용
#파이썬 예약된 용어 사용 X
#if 나 for같은 것은 변수 사용 xx
import keyword
print(keyword.kwlist)
#사용 x['False', 'None', 'True', 'and', 'as', 'assert', 'async' 
#,'await', 'break', 'class', 'continue', 'def', 'del', 'elif',
# 'else', 'except', 'finally', 'for', 'from', 'global', 'if', 'import'
# , 'in', 'is', 'lambda', 'nonlocal', 'not', 'or', 'pass', 'raise', 
# 'return', 'try', 'while', 'with', 'yield']

#자주 사용하는 함수
#print="text"
print(3)

#보너스 -함수 변수에 저장하기
출력 = print
출력("와 이게 되네?")