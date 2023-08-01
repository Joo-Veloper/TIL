#변수
store_name = '프로그래머스'
store_no=200


#할인가가 적용된 상품 가격 얻는 함수:
def purchase_price(price, sale_per):
    new_price = price * (100 - sale_per) / 100
    new_price = int(new_price)
    return new_price

# print(__name__)
#__name__=:시작점 파일"__main__"  그외(파일명)
if __name__ == "__main__":


    #함수 실행
    print(purchase_price(20000, 50))
    print(purchase_price(40000, 20))
    

