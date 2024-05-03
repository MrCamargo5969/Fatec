# llama3-70b-8192
from groq import Groq

def user():
    return input('O que quer saber? -> ')
def main():
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
            "content": user(),
        }
        ],
        model="llama3-70b-8192",
    )

    print(chat_completion.choices[0].message.content)

if __name__ == "__main__":
    main()