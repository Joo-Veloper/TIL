#list 참조와 복사

score_A=[80,70,60,50,40]
score_B=score_A#[80,70,60,50,40]
score_B[0]=100#[100,70,60,50,40]

print(score_A)
print(score_B)