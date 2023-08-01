#while 조건> while True if break
#while 조건식

#1
goal_num=10000000
step=2
result=1

count=0
while result < goal_num:
    result *= step
    count +=1
print(f'count:{count} result:{result}')

#while True:
goal_num=10000000
step=2
result=1

count=0
while True:
    result *= step
    count +=1
    if result >= goal_num:
        break
print(f'count:{count} result:{result}')


#2 
import random, time
learning_score=random.randint(1,100)
#print(learning_score)

while learning_score < 90:
    print(f'학습 스코어 미달:{learning_score}')
    learning_score=random.randint(1,100)
    time.sleep(1)
print(f'최종 학습 스코어:{learning_score}')

#while True
import random, time
learning_score=random.randint(1,100)

while True:
    print(f'학습 스코어 미달:{learning_score}')
    learning_score=random.randint(1,100)
    time.sleep(1)
    if learning_score>=90:
        break
print(f'최종 학습 스코어:{learning_score}')

