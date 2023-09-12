# #파라미터 기본값 지정
# #기본값 지정값은 뒤쪽으로 넣는다
#인자 지정
# def teleport(x=0, y=0, z=1):
#     print(f'텔레포트! {x}, {y}, {z}')

# teleport(100,200,5)
# teleport(100,200)
# teleport(200)
# teleport()
# teleport(z=999)
# teleport(z=999, x=50)



#위치 에너지 mgh 지구 : 9.807m.s 화성: 3.721m/s 달 1.62m/s
#매개 값 지정

# def potential_energy(mass, height, gravity=9.8):
#     return mass * gravity* height

# print(potential_energy(100,20))
# print(potential_energy(100,20,0.5))


#멤버십이 처음에는 Bronze
def user(name, email, membership='Bronze'):
    print(f'가입완료,{name} {email} {membership}')

user('스펜서', 'spencer@grepp.co')
number=3