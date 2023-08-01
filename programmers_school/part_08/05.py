#for in list 의 주의사항
#for 문 도중 member의 remove > 넘어가는 데이터가 생김
member=['Spencer','Adela','Allen','Chen','John','Albert','Andy','Darby']

for user in member.copy():
    if user[0]in['A','a']:
        member.remove(user)

print(member)

#기대:['Spencer','Chen','John','Darby']
#실제:['Spencer', 'Allen', 'Chen', 'John', 'Andy', 'Darby']

#2
# #for문 도중 member의 append>
member=['Spencer','Adela','Allen','Chen','John','Albert','Andy','Darby']

for user in member[:]:
    if user[0]in['A','a']:
        member.append(user)

print(member)
# #기대:['Spencer','Adela','Adela','Allen','Allen','Chen','John','Albert','Andy','Darby']
# #실재:끝나지 않음



#3
#for 에서의 수정 (update)
member=['Spencer','Adela','Allen','Chen','John','Albert','Andy','Darby']

for user in member:
    if user[0]in['A','a']:
        user=0
print(member)
#기대 :['Spencer',0,0,'Chen','John',0,0,'Darby']
#실제: ['Spencer', 'Adela', 'Allen', 'Chen', 'John', 'Albert', 'Andy', 'Darby']


#3
#for 에서의 수정 (update)개선
member=['Spencer','Adela','Allen','Chen','John','Albert','Andy','Darby']
index=0
for user in member:
    if user[0]in['A','a']:
        member[index]=0
    index += 1
print(member) #['Spencer', 0, 0, 'Chen', 'John', 0, 0, 'Darby']

#4 #eumerate()

rainbow=['red','orange','yellow','green','blue','navy','purple']

#0번째 색깔은 red
#1번째 색깔은 orange
index=0
for color in rainbow:
    #print(f'{index+1}번째 색깔은 {color}')
    index += 1
#print(list(enumerate(rainbow))) #해당 데이터는 0x0000027044D33B40 위치에 존재한다 값이 어떻게 생겼는지 확인 불가
#list를 쓰면 인덱스랑 벨류를 짝꿍으로 만들어 준다.



#enumberate()+여러개 변수 할당
for color in enumerate(rainbow):
    print(f'{color[0]}번째 색깔은 {color}')