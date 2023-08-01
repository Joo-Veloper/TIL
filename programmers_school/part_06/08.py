# #if list, tuple, sequence - in 연산자

# #casel soccer, baseball, basketball

# sport='soccer'
# if sport == 'soccer' or sport =='baseball' or sport =='basketball':
#     print("조사항목포함")
# else:
#     print("비조사항목")

# #case 2
# sport='tennis'
# if sport == 'soccer' or sport =='baseball' or sport =='basketball':
#     print("조사항목포함")
# else:
#     print("비조사항목")


# #case 3
# sport='soccer'
# check_sports=['soccer','baseball','basketball']
# if check_sports.count(sport):
#     print("조사항목포함")
# else:
#     print("비조사항목")

# #case4 in연산자
# #print(3 in [1,2,4])

# sport='soccer'
# check_sports=['soccer','baseball','basketball']
# if sport in check_sports:
#     print("조사항목포함")
# else:
#     print("비조사항목")


# 회원가입 아이디 입력
member = ['spencer', 'mark1234', 'program', 'mussg3243']
username = input("가입할 아이디 : ")

# 조건문 작성
if len(username) <= 6:
    print("최소 글자 수는 6입니다.")
elif len(username) > 12:
    print("최대 글자 수는 12입니다.")
elif username in member:
    print("이미 사용하는 아이디입니다.")
elif '' in username:
    print('아이디에 공백을 포함할 수 없습니다.')
else:
    print("사용 가능한 아이디입니다.")