# # elif
# number = -1
# if number>0:
#     print(f"{number}는 양수입니다.")
# elif number < 0:
#     print(f"{number}는 음수입니다.")
# else:
#     print(f"{number}는 0")

# print("계산이 끝났습니다.")

# #비교 논리 연산자 조건식
# #비교연산자
# # 3>5#False
# # 3<5#True
# # 3>=5#False
# # 3<=5#True
# # 3!=5#True
# # 3==5#False

# #논리연산자 and 양쪽이 모두 True면 True 하나라도 False면 False
# True and True #True
# True and False #False
# False and True #False
# False and False #False

# #논리 연산자 or 양쪽이 모두 False 면 Flase 하나라도 True 면 True
# True and True #True
# True and False #True
# False and True #True
# False and False#False

# #논리 연산자 not 뒤의 값을 부정한다.
# not True # False
# not False # True
# not 3>5 #True

# False and not True
# not True and True
# False or not True
# not False or False

# # 연산자 우선순위   
# # ** 거듭제곱
# # + / // % 곱셈 나눗셈 정수나눗셈, 나머지
# # +,- 덧셈 뺼샘
# # < <= > >= != == 비교
# # not 논리 not
# # and 논리 and
# # or 논리 or

# 회원가입 아이디 입력
username = input("가입할 아이디 : ")

# 가입할 아이디는 최대 12자까지만 가능합니다.
if len(username)<12:
    print("사용 가능한 아이디입니다.")
else:
    print(f"최대 글자 수(12)를 넘었습니다. {username} - {len(username)}자")