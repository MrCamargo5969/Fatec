import requests
from lxml import html
url = requests.get('https://finance.yahoo.com/commodities/')
date = html.fromstring(url.content)
nome = date.xpath('//*[@id="list-res-table"]/div[1]/table/tbody/tr[33]/td[2]/text()')
preco = date.xpath('//*[@id="list-res-table"]/div[1]/table/tbody/tr[33]/td[3]/fin-streamer/text()')
print(f'{nome[0]} with value equal a ${preco[0]}')