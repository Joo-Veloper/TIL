#list comprehension
#for문을 통해서 새로운 값을 계산하고 리스트를 새로 생성할때 또는
# 기존 데이터를 교체할때 한줄로 표현 하기 위한 방법
#for문을 한줄로 작성하는 방법
#y = x**2
xs = list(range(0,100))
#casel
ys1=[]
for x in xs:
    ys1.append(x**2)
print(ys1)

#case 2
ys2=[x**2 for x in xs]
print(ys2)

print(ys1==ys2)# ys1 과 ys2가 같은지 확인

#case 3
ys3=[f'x는 {x}, y는 {x**2}' for x in xs]
print(ys3)

#case4
ys4=[(x,x**2)for x in xs]
print(ys4)