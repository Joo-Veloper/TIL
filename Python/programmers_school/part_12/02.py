# 게임
#캐릭터 속성(attr)-이름, 에너지, 레벨
#캐릭터 매서드(method)-먹는것, 레벨업

name = 'spencer'
energy=50
level=1



def show():
    print(f"STAT : name:{name}, energy:{energy}, level{level}")

def eat(food):  
    global energy
    if food == '이상한사탕':
        energy += 100
    elif food in ['빵','김밥','라면']:
        energy += 30
    else:
        energy += 10

def level_up():
    global energy,level
    if energy < 100:
        print(f'실패 : 에너지 100 필요 - energy:{energy}')
    else:
        energy -= 100
        level += 1
        print(f'레벨업 : energy:{energy} level:{level}')
               
#메인 영역
show()
eat('빵')
show()
eat('이상한사탕')
level_up()
show()