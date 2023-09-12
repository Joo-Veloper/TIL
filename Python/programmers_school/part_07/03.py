# ## 함수의 값 return은 죽어서 무엇을 남긴다. return이 실해되면 함수는 종료
# def area_triangle(a,b):
#     print(a*b/2)
#     return a*b/2
# #return은 print뒤에 나와야함 먼저 나오면 x
# tr=area_triangle(3,4)

# # 함수가 종료되는 경우
# # 1.코드가 더 없거나
# # 2.return을 만나거나

# # return의 목적

# # 1.호출한 곳에 값을 돌려주거나
# # 2.함수를 종료시키거나

# #쇼핑몰 할인율 -> 구매가격
def purcharse_price(price, sale_per):
    new_price = price *(100-sale_per)/100
    new_price=int(new_price)
    return new_price


#함수 설정
p1=purcharse_price(20000, 50)
p2=purcharse_price(40000, 20)
print(p1,p2) #None None
print(p1+p2)