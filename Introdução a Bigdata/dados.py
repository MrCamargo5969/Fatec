import os
import glob

arquivo = 'dataset.csv'
arquivo = open(arquivo,'r')

dados = arquivo.readlines()

somatorio = 0
velhoi = 0
for i in range(len(dados)):
    if i == 0:
        continue 
    idade = dados[i].replace(" ", "").replace("\n","").split(",")[1]
    nome = dados[i].replace(" ", "").replace("\n","").split(",")[0]
    if int(idade) > velhoi:
        velhoi = int(idade)
        velhon = nome
    somatorio = int(somatorio) + int(idade)
media = somatorio / (len(dados) -1)
print(media)
print(f"Mais velho, {velhon} {velhoi}")

    