#while vs for
#1for
users=['Allen','chen','John','May']
for user in users:
    print(f'{user}가 입장했습니다.')

#3while
users=['Allen','chen','John','May']
index=0
while index<len(users):
    print(f'{users[index]}가 입장했습니다.')
    index+=1
#4
users=['Allen','chen','John','May']
for user in users:
    print(f'{user}가 입장했습니다.')
    user=0
print(users)

#5

#for로 변환
goal_num=10000000
step=2
result=1

count=0
for count in range(1, 100):
    result *= 2
    count +=1
    if result >= goal_num:
        print(f'count:{count} result:{result}')
        break