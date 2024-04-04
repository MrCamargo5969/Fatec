import requests as r
from lxml import html
pagina = r.get('https://eurohoje.com/')
dados = html.fromstring(pagina.content)
preco = dados.xpath('//*[@id="nacional"]') [0].value
print(preco)