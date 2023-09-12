#time.py
import time

#time.sleep(int|float)
print('start')
time.sleep(.5)
print('end')

#time.time()
start=time.time() #유닉스 시간 UTC 1970.1.1 00:00:00 ~ 몇초 가 지났는 지 
print(start)

#시간 측정
print('----')
start=time.time()
total=0
for i in range(100000):
    total += i
    #print(total)
print(total)
end=time.time()
print(end - start)