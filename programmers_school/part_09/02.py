#dict vs list

user1=['스팬서',1.0, 0.9, 200, 60, 265, 260]


user2={
    'name':'스팬서',
    'eye_L':1.0,
    'eye_R':0.9,
    'height':200,
    'weight':60,
    'foot_L':265,
    'foot_R':260,
}
print(user2['foot_L'])


user3={
    'name':'스팬서',
    'eye':{'L':1.0,'R':0.9},
    'height':200,
    'weight':60,
    'foot':{'L':265,'R':260},
}
print(user3['foot']['L'])

user4={
    'name':'스팬서',
    'eye':[1.0,0.9],
    'height':200,
    'weight':60,
    'foot':[265,260]
}
print(user4['foot'][0])

#나무정원
trees = [200, 250, 450, 300]
trees={
    'tree1':200,
    'tree2':250
}

garden={
    'size':500,
    'phone':'010-1234-5678',
    'trees':[200,250,450,300]
}
print(garden)

print(garden['trees'][0])
