# import requests
# from bs4 import BeautifulSoup 
# url = "http://www.cps.sp.gov.br/cursos-oferecidos-pelas-fatecs"
# source_code = requests.get(url)
# plain_text = source_code.text
# soup = BeautifulSoup(plain_text, "html.parser")
# cursos = soup.find_all (class_="listagem-posts-titulo")
# #print (cursos [0].get_text())
# for i in cursos:
#     print(i.get_text())


import requests
from bs4 import BeautifulSoup 
url = "https://coinmarketcap.com/pt-br/currencies/bitcoin/"
source_code = requests.get(url)
plain_text = source_code.text
soup = BeautifulSoup(plain_text, "html.parser")
bit = soup.find(class_="sc-f70bb44c-0 eZIItc base-text")
print(bit.get_text())


