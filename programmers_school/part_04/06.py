#list append insert
# index.value(element)->item
#append:추가
#insert:삽입 

user1=['spencer','200']
user2=['Mussg','50']

#추가
user1.append(100)
user2=user2+[150,]
print(user1,user2)

#추가
user1.append([1.0, 0.8])
user2 = user2 +[[1.0, 0.8]]
print(user1[3], user2[3])


#삽입
user1=['spencer','200']
user2=['Mussg','50']
user1.insert(1, 100)
print(user1) 
user2.insert(100, 150)
print(user2) 
