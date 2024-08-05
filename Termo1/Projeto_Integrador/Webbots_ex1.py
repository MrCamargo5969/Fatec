import requests
from bs4 import BeautifulSoup
url = 'http://fx-rate.net/USD/'
usd_to_real = BeautifulSoup(requests.get(url).text, "html.parser").find(title="Dollar to Chilean Peso").get_text()
print(usd_to_real)