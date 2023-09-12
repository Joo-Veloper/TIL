##함수

# 아침 인사
user="스팬서"
print("안녕하세요")
print(f"오랜만이네요~{user}")
print("오늘 좋은 하루 되길 바래요")



# 아침 인사  #위는 함수 정의 영역
def to_greeting():
    user="스팬서"
    print("안녕하세요")
    print(f"오랜만이네요~{user}")
    print("오늘 좋은 하루 되길 바래요")

#함수 실행 #메인코드 영역
to_greeting()

#삼각형 넓이
area =10*8/2
print(f'삼각형의 넓이는 {area}입니다.')

#define Function
def calc_triangle():
    area=10 * 8/2
    print(f'삼각형의 넓이는 {area}입니다.')
#실행
calc_triangle()
calc_triangle()