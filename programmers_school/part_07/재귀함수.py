#n, n-1, n-2,....1또는 0까지
#재귀함수(Recursion)


# def countdown(number):
#     print(number)
#     if number==0:
#         return
#     else:
#         countdown(number-1)
#     print(f'함수 종료 {number}')

# countdown(10)




# def countdown(number):
#     print(number)
#     if number==0:
#         return
#     else:
#         return ? countdown(number-1)
#     #? 어떤 함수

# countdown(10)


#팩토리얼
#4!=4*3!
#3!=3*2!
#2!=2*1

def factorial(number):
    if number==1:
        return 1
    else:
        return number * factorial(number-1)
    
#테스트
print(factorial(2))
print(factorial(3))
print(factorial(4))
print(factorial(5))



