#2가 몇번 곱해져야 1000만이 넘을까?
#몇 번에 대한 것이 미지수, 무한반복의 가능성-> while
#처리할 데이터가 정해져 있거나, 최대 몇번에 대한 것이 정해짐, 무한 반복은 x->for
#1
goal_num=10000000
step=2
result=1

count=0
while result < goal_num:
    result *= step
    count +=1
print(f'count:{count} result:{result}')

#제대로 된 입력할 때까지
#3
name=input("Enter yourname : ")

while not name:
    print("이름을 제대로 입력해주세요")
    name=input("Enter yourname : ")

print(name)


# #대안

name=None
while not name:
    print("이름을 제대로 입력해주세요")
    name=input("Enter yourname : ")

print(name)

#4
#특정 숫자가 나올 때 까지 반복
#데이터 분석이나 인공지능을 하다보면, 원하는 결과가 나올 때까지 기다려야 할 때가 있다.
import random, time
learning_score=random.randint(1,100)
#print(learning_score)

while learning_score < 90:
    print(f'학습 스코어 미달:{learning_score}')
    learning_score=random.randint(1,100)
    time.sleep(1)
print(f'최종 학습 스코어:{learning_score}')