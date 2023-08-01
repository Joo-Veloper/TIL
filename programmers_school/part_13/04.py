#1
import random
n1=random.random()#0-1 float

for _ in range(1000):
    n2 = random.randint(0, 255)
    if n2 == 255:
        print(True)

#2
import random
n1=random.random()
n2=random.randint(0, 255)
n3=random.uniform(0, 255)
print(n1, n2, n3)

#seed -> 마인크래프트 맵 seed
#랜덤 x -> 난수 알고리즘 -> 임의 값
#입력 x1 -> 출력 y
#입력 x1 -> 출력 y
#seed현재시간
#고정
random.seed(0)
print(random.random())
print(random.random())
#랜덤
random.seed()
print(random.random())
print(random.random())


#choice
nums= list(range(1,46))
print(random.choice(nums))
print(random.sample(nums,6))

#shuffle
print(nums)
random.shuffle(nums)
print(nums)

#코딩테스트
#예제1
import statistics
nums=[1,2,3,4,5,6,7,7,9,99]

print(sum(nums)/len(nums))
print(statistics.mean(nums))
print(statistics.median(nums))#중앙 (숫자를 순서대로 나열했을때 중앙이 있는 수)
print(statistics.mode(nums))#최빈 (리스트에서 많은 수)


#예제2
import heapq
nums=[1,2,3,4,5,6,7,8]

print(max(nums), min(nums))
print(heapq.nlargest(3, nums))
print(heapq.nsmallest(3, nums))
print(heapq.nlargest(3, nums)[-1]) #3번째로 큰수
print(heapq.nsmallest(3, nums)[-1])# 3번째로 작은수


