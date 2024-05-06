# llama3-70b-8192
import csv
from groq import Groq

mente = [["Historico_User: ", "Historico_IA: "]]
conversa_atual = []
def user():
    resposta = input('O que quer saber? -> ')
    conversa_atual.append(resposta)
    return resposta

def resposta(resposta):
    conversa_atual.append(resposta)
    print(resposta)
    return resposta

def main():
    while True:
        mente.append(conversa_atual)
        conversa_atual.clear()
        user_ = user()
        try:
            client = Groq(
                api_key="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",
                )

            chat_completion = client.chat.completions.create(
                messages=[
                {
                    "role": "system",
                    "content": "você é uma IA assistente, responda o que lhe for perguntado de forma eficiente"
                },
                {
                    "role": "user",
                    "content": user_,
                },
                {
                    "role": "system",
                    "content": str(mente)
                },
                ],
                model="llama3-70b-8192",
            )
        except:
            break
        resposta(chat_completion.choices[0].message.content)
        with open('chat_memory.csv', 'a', newline='') as file:
            writer = csv.writer(file)
            for linha in mente:
                writer.write(linha)


if __name__ == "__main__":
    main()