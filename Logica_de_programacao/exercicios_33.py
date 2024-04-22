import random
alunos = int(input('Quantas médias calcular?\n-> '))

for n, i in enumerate(range(alunos)):
    x = random.randint(1,10)
    y = random.randint(1,10)
    m = (x+y)/2
    if m >= 7:
        print(f'Aluno {n+1:02} tem média {m} e está "APROVADO"')
    else:
        print(f'Aluno {n+1:02} tem média {m} e está "REPROVADO"')