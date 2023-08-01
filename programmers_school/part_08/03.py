# #for 반복문
# member=['spencer','Mussg','Allen','Chen','John','May']
# thief="Allen"
# for person in member:
#     print(person)

#     if person == thief:
#         print("도둑이야!")
#         print("당신은 변호사를 선임할 수 있으며...")
#         break #반복문을 정지 시킨다. Allen까지만 검사함 

# print("검문이 끝났습니다.")

member = ['스펜서', '도둑인가', '도로묵둑', '도둑', '도동독', '머쓱이']


for person in member:
    if '도둑' in person:
        print(f'{person}님은 추가 검문 대상입니다. ')
    else:
        print(f'{person}님은 통과 대상입니다.')
    
    
