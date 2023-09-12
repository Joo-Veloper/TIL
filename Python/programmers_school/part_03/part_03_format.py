# #string fomat
# text1="{}대학 {}학번 {}입니다."   
# text2="{0}대학 {1}학번 {2}입니다.{2}은/는 {1}학번입니다."# 장점 -재사용성


# #format (최종적 문자를 만들어주는 auto기능을 가지고 있다.)
# new_text1=text1.format('머쓱',20,'스팬서')
# print(new_text1)


# new_text2=text2.format('머쓱',20,'스팬서')
# print(new_text2)


# print(text2.format('머쓱',20,'스팬서')) 
name = "머쓱이"
family = "벌새과"
height = 17

text = "{}({},{}cm)".format(name, family, height)
print(text)