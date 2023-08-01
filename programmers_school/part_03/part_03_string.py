#Text-String(문자열)
text1='안녕하세요'
text2="프로그래머스입니다."
text3="스펜서는 '이렇게 작은 따옴표'라고 말했다."
text4="스펜서는 \"이렇게 작은 따옴표\"라고 말했다."
text5="""이렇게
장문의 머쓱이 편지를
쓸수있습니다."""

print(text1+text2)

#특수문자 \n \t \ 이스케이프 문자
#\n \t \' \" \\
text6="abcd\nefg"
print(text6)

text6="abcd\tefg"
print(text6)

print('Mussg\'s favprite food is bugs in Python')