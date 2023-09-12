# users = [
#     {'name': '머쓱이', 'part': 'AI', 'pay': 50000},
#     {'name': '스펜서', 'part': 'BackEnd', 'pay': 15000},
#     {'name': '쓰쓱이', 'part': 'FrontEnd', 'pay': 40000},
# ]


# # 스펜서의 페이(pay)를 50000으로 올려주자
# users[1]['pay'] += 35000
# print(users)

# users = [
#     {'name': '머쓱이', 'part': 'AI', 'pay': 50000},
#     {'name': '스펜서', 'part': 'BackEnd', 'pay': 15000},
#     {'name': '쓰쓱이', 'part': 'FrontEnd', 'pay': 40000},
# ]

# # for문을 작성하여 30000이상 페이를 받는 분만 출력해봅시다.
# for user in users:
#     if user['pay']>=30000:
#         print(user)


# response = {
#     "result": {
#         "label_kr": ["새", "벌새", "꽃", "벌레", "자연", "파이썬"],
#         "label_en": ["Bird", "Hummingbird", "Flower", "Bug", "Nature", "Python"]
#     }
# }

# print(response["result"]["label_kr"] )

# response = {
#     "result": {
#         "label_kr": ["새", "벌새", "꽃", "벌레", "자연", "파이썬"],
#         "label_en": ["Bird", "Hummingbird", "Flower", "Bug", "Nature", "Python"]
#     }
# }

# find_tag = input("검사할 태그 이미지를 입력하세요 : ")

# # 이미지 태그 결과에 find_tag가 있는지 확인하는 if문을 아래 작성해봅시다.
# if find_tag in response["result"]["label_kr"]:
#     print("해당 이미지 태그에 파이썬 감지")
# else:
#     print("해당 이미지 태그에 자바 미감지")

# if find_tag in response["result"]["label_en"]:
#      print("해당 이미지 태그에 Python 감지")
# else:
#     print("해당 이미지 태그에 Java 미감지")

# response = {
#     "result": {
#         "label_kr": ["새", "벌새", "꽃", "벌레", "자연", "파이썬"],
#         "label_en": ["Bird", "Hummingbird", "Flower", "Bug", "Nature", "Python"]
#     }
# }

# find_tag = input("검사할 태그 이미지를 입력하세요: ")

# if find_tag == "자바" and find_tag in response["result"]["label_kr"]:
#     print("해당 이미지 태그에 자바 미감지")
# elif find_tag == "Java" and find_tag in response["result"]["label_en"]:
#     print("해당 이미지 태그에 Java 미감지")
# elif find_tag == "파이썬" and find_tag in response["result"]["label_kr"]:
#     print("해당 이미지 태그에 파이썬 감지")
# elif find_tag == "Python" and find_tag in response["result"]["label_en"]:
#     print("해당 이미지 태그에 Python 감지")


# if find_tag == "파이썬" and find_tag in response["result"]["label_kr"]:
#     print("해당 이미지 태그에 파이썬 감지")
# elif find_tag == "Python" and find_tag in response["result"]["label_en"]:
#     print("해당 이미지 태그에 Python 감지")
# elif find_tag == "Java" and find_tag in response["result"]["label_en"]:
#     print("해당 이미지 태그에 Java al감지")
# elif find_tag == "자바" and find_tag in response["result"]["label_kr"]:
#     print("해당 이미지 태그에 자바 미감지")

response = {
    "result": {
        "label_kr": ["새", "벌새", "꽃", "벌레", "자연", "파이썬"],
        "label_en": ["Bird", "Hummingbird", "Flower", "Bug", "Nature", "Python"]
    }
}

find_tag = input("검사할 태그 이미지를 입력하세요 : ")

# 이미지 태그 결과에 find_tag가 있는지 확인하는 if문을 아래 작성해봅시다.
if find_tag == "자바":
    if find_tag in response["result"]["label_kr"]:
        print("해당 이미지 태그에 자바 미감지")
    else:
        print("해당 이미지 태그에 자바 미감지")
elif find_tag == "Java":
    if find_tag in response["result"]["label_en"]:
        print("해당 이미지 태그에 Java 미감지")
    else:
        print("해당 이미지 태그에 Java 미감지")
elif find_tag == "파이썬" and find_tag in response["result"]["label_kr"]:
    print("해당 이미지 태그에 파이썬 감지")
elif find_tag == "Python" and find_tag in response["result"]["label_en"]:
    print("해당 이미지 태그에 Python 감지")
    