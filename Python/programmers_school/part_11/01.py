#1
try:
    1/0
except:
    pass

#2
try:
    1/0
except Exception as e:
    print(e)
print("정상 종료")

#3
try:
    #1+"가" #type Error
    int("가") #Value Error
except ValueError as ve:
    print(f'>>> {ve}')
except Exception as e:
    print(f'>>> {e}')
#4
try:
    num=3
    print(num)
except Exception as e:
    print(e)
finally:
    print('try문 종료 - 마무리 수행')


#최종 정리

try :
    #수행 , 시도할 코드
    pass
except ValueError:
    #Valueerror 예외처리
    pass
except (ZeroDivisionError, TypeError):
    #ZeroDivisionError, TypeError 다중 예외 처리
    pass
except Exception:
    #그외 예외 + default 예외 처리
    pass
finally:
    #무조건적으로 마무리 코드로 수행은 되야 한다~
    pass

#처리할 데이터에 예상치 못한 값, 상황이 발생할 때
#y=2/x+1

nums=[0,3,9,12,'a','a',15]

for x in nums:
    try:
        print(f'2/{x}+1={2/x+1}')
    except (ZeroDivisionError, TypeError) as e:
        print(f'>>> Error:{e}')
    except Exception as e:
        print(e)