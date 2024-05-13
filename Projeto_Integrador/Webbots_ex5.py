from bs4 import BeautifulSoup
import requests
url = 'https://www.dafiti.com.br/'
pagina = requests.get(url)
soup = BeautifulSoup(pagina.content, 'html.parser')
print(soup.find_all('a'))
print(soup.find_all('a')[0])
print(soup.find_all('a')[0].get_text())
print(soup.find_all('a')[0]["href"])