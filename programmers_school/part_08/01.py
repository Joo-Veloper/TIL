# #for문 
# basket=['apple','banana','orange','melon']


# #for 변수명 in 리스트:
# for item in basket: # basket에서 가져오는것은 item 이다.
#     print(f'{item}을 먹었습니다.')

# print(item) #item이라는 변수는 for문이 끝났어도 끝나지 않는다.


#예시
lines = ['Spencer', 'Chen', 'John', 'Darby']

for item in lines:
    print(f'{item}가 입장하였습니다.')
    
print("모두 입장을 마쳤습니다.")

#예시1
COLORS = ('RED', 'ORANGE', 'YELLOW', 'GREEN', 'BLUE', 'NAVY', 'PURPLE')

# for문을 작성해보자.
for item in COLORS:
    print(f'{item}')
    