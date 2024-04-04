import requests
from bs4 import BeautifulSoup
url = 'https://coinmarketcap.com/pt-br/currencies/bitcoin/'

coin = BeautifulSoup(requests.get(url).text, "html.parser")
bit = coin.find(class_="sc-f70bb44c-0 flfGQp flexStart alignBaseline")
bit1 = bit.get_text()
bit2 = bit1.split(" ")
print(bit2[0])