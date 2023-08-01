#break 반복문을 정지 continue
basket=['apple','banana','orange','melon']

for item in basket:
    if item == 'orange':
        continue #현재 반복 차례 skip
    print(f'{item}을 먹었습니다.')

#1,2,3,4,5,6,7,8
for n in range(1,31):
    if n%3==0:
        continue #skip
    print(n)

#while
#1
n=1
end=31
while n < end:
    if n % 3==0:
        n+=1
        continue
    print(n)
    n += 1
#2
n=0
end=31
while n < end:
    n+=1
    if n % 3==0:       
        continue
    print(n)
    n += 1