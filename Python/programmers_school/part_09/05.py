# #dict_for

# # basket={
# #     'apple':3,
# #     'banana':4,
# #     'pineapple':5,
# #     'orange':6
# # }

# # for item in basket:
# #     print(item)
# #     print(f'{item}은 {basket[item]}개 있습니다.')

# # #2
# # basket={
# #     'apple':3,
# #     'banana':4,
# #     'pineapple':5,
# #     'orange':6
# # }

# # for item in basket:
# #     print(item)
# #     print(f'{item}은 {basket[item]}개 있습니다.')

# # for key, value in basket.items():
# #     print(key,value)
# #     print(f'{key}는 {value}개 있습니다.')

# #3
# member=[
#     {'name':'Spencer','colleage':'프로그래머스','year':20,'lang':'Python'},
#     {'name':'Spencer','colleage':'프로그래머스','year':20,'lang':'C++'},
#     {'name':'Spencer','colleage':'프로그래머스','year':20,'lang':'Java'},
#     {'name':'Spencer','colleage':'프로그래머스','year':20,'lang':'Scratch'},
#     {'name':'Spencer','colleage':'프로그래머스','year':20,'lang':'HTML'}
# ]

# for user in member:
#     if user['lang']=='Java':
#         print(user)






# user = {'name': '머쓱이', 'part': 'AI', 'pay': 50000}

# # 딕셔너리 for문을 이용하여 '출력예시'처럼 나오도록 코드를 작성하세요
# for users in user:
#     print('name >', user['name'])
#     print('part >', user['part'])    
#     print('pay >', user['pay'])
#     print()

users = [
    {'name': '머쓱이', 'part': 'AI', 'pay': 50000},
    {'name': '스펜서', 'part': 'BackEnd', 'pay': 15000},
    {'name': '쓰쓱이', 'part': 'FrontEnd', 'pay': 40000},
]

# 리스트 for문 + 딕셔너리 for문을 이용하여 '출력예시'처럼 나오도록 코드를 작성하세요
for i, user in enumerate(users, 1):
    print(f'==={i}번 유저 정보===')
    print('name >', user['name'])
    print('part >', user['part'])    
    print('pay >', user['pay'])
    print()

