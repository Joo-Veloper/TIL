0#list slice -> 비파괴적
#코딩 테스트에서 유리
nums=[33,22,11,77,55,66,99,88]
print(nums[2:6])
print(nums[6:2])
print(nums[-2:-6])
print(nums[-6:-2])

# 앞(0)숫자와 뒷숫자(맨마지막)를 생략
print('앞(0)숫자와 뒷숫자(맨마지막)를 생략')
print(nums[:6])#0~6자리까지
print(nums[2:])#2~6자리까지


#step 
print('step')
nums=[33,22,11,77,55,66,99,88]
print(nums[2:6])
print(nums[2:6:2])
print(nums[2:6:3])
print(nums[6:2:-1])

#adv slice
print('adv slice')
nums=[33,22,11,77,55,66,99,88]
print(nums[:])
print(nums[::-1]) #역순
new_nums=nums[::-1]
print(new_nums)
