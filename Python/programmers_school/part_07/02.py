#매개변수

#삼각형의 넓이 Define Function
def calc_triangle(width, height):
    
    area=width * height/2
    print(f'삼각형의 넓이는 {area}입니다.')
#실행
calc_triangle(10,20)
calc_triangle(100,200)


# 아침 인사  #위는 함수 정의 영역
def to_greeting(user):
    
    print("안녕하세요")
    print(f"오랜만이네요~{user}")
    print("오늘 좋은 하루 되길 바래요")

to_greeting('스팬서')
to_greeting('머쓱이')

#쇼핑몰 할인율 -> 구매가격
def purcharse_price(price, sale_per):
    new_price = price *(100-sale_per)/100
    new_price=int(new_price)
    print(f"구매가격은 {new_price}입니다.")
#함수 설정
purcharse_price(20000, 50)
purcharse_price(40000, 20)