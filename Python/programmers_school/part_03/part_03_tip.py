num1=123.456789

num2=round(num1,1)#1은 두번째자리에서 반올림 2는 세번째 자리에서 반올림
print(num2)

num3=round(num1,-1)#123의 3에서 반올림 됬기에 120.0 출력
print(num3)

#format()->문자열
num2="{0:.2f}".format(num1)
print(num2)#소숫점 두번째 짜리까지 출력 세번째자리는 반올림 되서 123.46출력
# 더하고 뺴고 싶다면 str->int float으로 형변환 시켜줘야함

#fstring-> 문자열
num2=f"{num1:.2f}"
print(num2) #위의 format()과 같은 결과값을 가져옴