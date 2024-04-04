#Professor fez
import requests
from bs4 import BeautifulSoup
url = 'http://fx-rate.net/EUR/'
source_code = requests.get(url)
plain_text = source_code.text
soup = BeautifulSoup(plain_text, "html.parser")
usd_to_real = soup.find(title="Euro to Real").get_text()
print(usd_to_real)
