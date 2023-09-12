#raise
#raise KeyboardInterrupt
#raise ZeroDivisionError

#값을 음수로 받을 경우 ValueError
number = int(input("Test Number : "))
if number < 0:
    raise ValueError("Negative numbers ar not allowed.")


#2 오류를 생성 + 제어
try:
    number = int(input("Test Number : "))
    if number < 0:
        raise ValueError("Negative numbers ar not allowed.")
except ValueError as ve:
    print(ve)


#3
def calc_triangle(width, height):
    if width < 0 or height < 0:
        raise ValueError("Negative numbers ar not allowed.")
    area = width * height / 2
    return area

#함수 실행
t1=calc_triangle(10,20)
t2=calc_triangle(100,200)
print(t1+t2)
t3= calc_triangle(-100,-200)
