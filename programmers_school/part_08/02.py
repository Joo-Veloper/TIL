print(range(10))
print(list(range(10)))
print(list(range(3,10)))
print(list(range(3,10,2)))

for x in range(3):
    print(f"테스트 함수 + 기능 {x}")
    
for x in range(1,10):
    print(f'3*{x}={3*x}')

for _ in range(3):
    print(f"안녕하세요!")

total = 1

for num in range(1, 11):
    total *= num

print(f'1부터 10까지 곱한 값은 {total}')