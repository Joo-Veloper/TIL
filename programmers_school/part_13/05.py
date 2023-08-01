nums=[1,2,3,4,4,4,5,5,5,6,6,6]
basket=['banana','banana','banana','apple','melon']

#set
print(list(set(nums)))
print(list(set(basket)))

#collection Counter class
from collections import Counter
print(Counter(nums))
print(Counter(basket)['banana'])
new_basket=dict(Counter(basket))
print(new_basket)

text='akdjqlkjt'
print(Counter(text).most_common(1))#제일 많이 나온 알파벳 한개  ()안 숫자를 2로 바꾸면 제일 많이 나온 알파벳 두개로 변경됨!!
new_text=Counter(text)
print(new_text)