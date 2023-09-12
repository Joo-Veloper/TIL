#list
#create
numbers=[0,1,2,3,4]
chars=['a', 'b', 'c', 'd']#가독성이 좋게하려고 ,옆에 빈칸을 사용
users=['Allen', 'Chen', 'John', 'May']
students=['Allen',170,'Chen',165, 'John',180, 'May',150]
#print(numbers, chars, users,students, sep='\n')

#access. update->lndex(자리번호)->0
print(numbers[4])
#print(numbers[5])는 에러 index에 4까지 밖에 없음
print(users[-4]) #-1은 index 뒤에서 부터 시작
#접근을 통해 데이터 변겅
users[-1]='Spancer'
print(users)

#delete->index
del users[-1]
print(users)
del users[0]
print(users)

# del users#애러 
# print(users)

