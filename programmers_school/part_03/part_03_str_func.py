#str_func.py
#upper
text="AbCdE"
print(text.upper())# 다 대문자로 변환하는 코드
print(text)#원본은 유지 non-destructive(비파괴적)

#lower

text="AbCdE"
print(text.lower())# 다 소문자로 변환하는 코드
print(text)

#count
cnt_C="aCbCdCeC".count('C')
print(cnt_C)

#isalph- 알파벳 체크
text="10 year old"
check=text.isalpha()
print(check)

#isnumeric-숫자만 체크
text="10 year old"
check=text.isnumeric()
print(check)

#isalnum-문자 숫자로만 체크
text="10 year old"
check=text.isalnum()
print(check)


#ljsut, center, rjust
text1="hello".ljust(10)
text2="hello".center(10)
text3="hello".rjust(10)

print(text1,text2,text3,sep='-')

#len(v)-길이 length
text="abcdefg"
print(len(text))

#예제 1번
text = """안녕하세요. 저는 이번 프로그래머스에 지원한 매력적인 벌새! 머쓱이 입니다.

저는 태어날 때부터 파이썬 버그를 먹으며 컸습니다. 때문에 어떤 버그가 맛있는지 맛없는지 보기만 해도 파악할 수 있습니다.

이제 저의 인생에 파이썬 버그는 너무 매력적입니다. 때문에 파이썬 버그를 많이 만날 수 있는 프로로그래머스에 일하는 것은 저에게 엄청난 매력으로 다가왔습니다.

프로그래머스에서의 발생하는 파이썬 버그를 모두 담당하여 더욱 매력적인 벌새가 되도록 하겠습니다.

감사합니다."""
space=0

print("글자 수 :",len(text)+space)


#예제 2번
text = """안녕하세요. 저는 이번 프로그래머스에 지원한 매력적인 벌새! 머쓱이 입니다.

이제 저의 인생에 파이썬 버그는 너무 매력적입니다. 때문에 파이썬 버그를 많이 만날 수 있는 프로로그래머스에 일하는 것은 저에게 엄청난 매력으로 다가왔습니다.

프로그래머스에서의 발생하는 파이썬 버그를 모두 담당하여 더욱 매력적인 벌새가 되도록 하겠습니다.

감사합니다."""

text=text.count('매력')
print("매력 :",text) 

