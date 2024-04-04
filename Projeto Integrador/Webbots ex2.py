import requests
from bs4 import BeautifulSoup
url = 'http://www.cps.sp.gov.br/cursos-oferecidos-pelas-fatecs'

fatec = BeautifulSoup(requests.get(url).text, "html.parser")
cursos = fatec.find_all(class_="listagem-posts-titulo")

with open('cursos_fatecs.txt', 'a', encoding='utf-8') as file:
    for c in cursos:
        file.write(c.get_text() + "\n")
        print(c.get_text())