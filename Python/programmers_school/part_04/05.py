#list와 str의 차이-sequence
text='abcde'
chars=['a','b','c','d','e']

#index
print(text[0])
print(chars[0])
print(text[-1])
print(chars[-1])


#slice
print(text[0:4])
print(chars[0:4])

#index-수정-> 문자열은 불가능
#text[0]='f'
# chars[0]='f'
# print(text,chars)


#삭제-del
# del text[0]
# del chars[0]


#삭제 .remove
chars.remove('a')
text=text.replace('a','')
print(text,chars)

#문자열->리스트
text='abcde'
chars=list(text)
print(text, chars)

#리스트 -> 문자열
chars=['a','b','c','d','e']
text1=str(chars) # ['a','b','c','d','e']
text2=''.join(chars)
print(chars,text1,text2)
