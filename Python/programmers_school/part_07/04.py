# """온도 표기법
# 섭씨(celsius)  C=(F-32)/1.8,=k-273.15
# 화씨 F=(C*1.8)+32,=(k-273.15)*1.8+32
# 절대온도 K=C+273.15,=(F-32)/1.8+273.15
# """

# # def 함수():
# #     return [3,4,5], 리스트를 이용
# #     return (3,4,5) 튜플을 이용


# #####list를 이용하기
# def convert_temperature(c):
#     c=c
#     f=c*1.8+32
#     k=c+273.15
#     return [c, f, k]

# #함수실행
# t=25.5
# t_expr=convert_temperature(t)
# print(t_expr)

# ######tuple을 이용하기
# def convert_temperature(c):
#     c=c
#     f=c*1.8+32
#     k=c+273.15
#     return (c, f, k)

# #함수실행
# t=25.5
# t_expr=convert_temperature(t)
# print(t_expr)


# #####기본적 반환은 tuple로 반환한다

# def convert_temperature(c):
#     c=c
#     f=c*1.8+32
#     k=c+273.15
#     return c, f, k

# #함수실행
# t=25.5
# t_expr=convert_temperature(t)
# print(t_expr)

# ################3
# def convert_temperature(t,unit):
#     if unit =='C':
#         c=t
#         f=c*1.8+32
#         k=c+273.15        
#     elif unit == 'F':
#         f=t
#         c=(f-32)/1.8
#         k=c+273.15        
#     elif unit == 'K':
#         k=t
#         c=k-273.15
#         f=c *1.8+32        
#     else:
#         c,f,k=False,False,False
#     return c, f, k

# #함수실행
# t=25.5
# t_expr=convert_temperature(t,'C')
# print(t_expr)

# t=25.5
# t_expr=convert_temperature(t,'F')
# print(t_expr)

# t=25.5
# t_expr=convert_temperature(t,'K')
# print(t_expr)

# t=25.5
# t_expr=convert_temperature(t,'A')
# print(t_expr)




