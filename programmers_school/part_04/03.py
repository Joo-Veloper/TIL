#list func전용 함수
#sort() 오름차순
nums=[33,22,11,77,55,66,99,88]
nums.sort()
print(nums)

#reverse=내림차순
nums=[33,22,11,77,55,66,99,88]
nums.sort(reverse=True) # 파괴적인 함수
print(nums)

#.reverse() 역순
nums=[33,22,11,77,55,66,99,88]
nums.reverse()
print(nums)

#.del은 index에서 삭제
#.remove(v)는 value값에서 삭제하는 방법
nums=[33,22,11,77,55,66,99,88]
nums.remove(11)
print(nums)

# #이 경우에 11이 두개 이지만 처음에 탐색된 11만 제거됨
# nums=[33,22,11,77,55,66,11,99,88]
# nums.remove(11)
# print(nums)

#.indxe(v)
nums=[33,22,11,77,55,66,99,88]
print(nums.index(11))

#.list를 병합->extend(v)
nums1=[33,22,11,77]
nums2=[55,66,99,88]
nums1.extend(nums2)
print(nums1)

nums3=nums1+nums2
print(nums3)


#.count(v)
nums=[33,22,11,77,55,66,11,99,88]
print(nums.count(77))

#.pop(i) .pip()
nums=[33,22,11,77,55,66,99,88]
num=nums.pop() #del nums[1]-> None
print(num)


#len()
nums=[33,22,11,77,55,66,99,88]
print(len(nums))

#sorted(v),sorted(v,revese=True)
nums=[33,22,11,77,55,66,99,88]
print(sorted(nums)) #비파괴적인 함수
print(nums)
print(sorted(nums,reverse=True)) 
print(nums)



