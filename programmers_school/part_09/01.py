#dictionary ->dict
#create

user1 = {'name':'Spencer', 'colleage':'프로그래머스','year':20}
user2 = {
    'name':'Spencer',
    'colleage':'프로그래머스',
    'year':20
}
print(user1, user2)

#access>update
print(user1['name'])#정보 조회 + 수정, 없으면 error
print(user1['year'])
print(user1.get('name')) #단순한 정보 조회, get함수가 없으면 None


user1['name']='Mussg'
print(user1)


user1['year']+=1
print(user1)

#add
user1['lang']='Python'
print(user1)

#delete
del user1['lang']
print(user1)

if user1.get('lang'): #.get('lang')
    del user1['lang']

#read
print(user1.get('lang'))
#print(user1['lang'])
