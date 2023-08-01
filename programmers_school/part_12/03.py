# 게임
#캐릭터 속성(attr)-이름, 에너지, 레벨
#캐릭터 매서드(method)-먹는것, 레벨업


class User:
    #init 초기화라는 매직 인스턴스-override
    def __init__(self, name):
        self.name = name
        self.energy=50
        self.level=1
    def __str__(self):
        return f"name:{self.name},level{self.level}"

    def show(self):
        print(f"STAT : name:{self.name}, energy:{self.energy}, level{self.level}")


    def eat(self, food):
       
        if food == '이상한사탕':
            self.energy += 100
        elif food in ['빵','김밥','라면']:
            self.energy += 30
        else:
            self.energy += 10


    def level_up(self):
      
        if self.energy < 100:
            print(f'실패 : 에너지 100 필요 - energy:{self.energy}')
        else:
            self.energy -= 100
            self.level += 1
            print(f'레벨업 : energy:{self.energy} level:{self.level}')

               
#메인 영역
user1=User('Spencer')
user2=User('Mussg')
print(user1)
print(user1.name)
print(user1.level)

#먹는 동작
user1.eat('이상한사탕')
user2.eat('빵')
user1.show()
user2.show()

#레벨 업 시도
user1.level_up()
user2.level_up()


#print
print(user1, user2)
t=str(user1)
print(t + 'abc')