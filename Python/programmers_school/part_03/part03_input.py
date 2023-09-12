#사용자에게 입력을 받는 input()

user=input("Enter username:")
print(user)


age=int(input("Enter your age"))
print(age)
new_age=age+5
print(f"You're {age}year old. 5years later..{new_age}!")
print(f"You're {age}year old. 5years later..{age+5}!")

#input -> 무조건 strig으로 반환 ->형변환 int float
