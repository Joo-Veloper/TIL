#match_case.py 3.10버전에서 사용됨
#switch/case문


status=300

match status:
    case 200:
        print(f"{status} Success")
    case 300:
         print(f"{status} Redirect")
    case 400:
        print(f"{status} client Error")
    case 500:
        print(f"{status} Server Error")
    case _:
       print(f"(status) 해당사항이 없습니다.") #와일드 카드 케이스는 아래에만 실행가능
    