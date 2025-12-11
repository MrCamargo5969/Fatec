📦 Problema da Mochila 0/1 — Programação Dinâmica

Este projeto implementa uma solução para o clássico Problema da Mochila 0/1 (0/1 Knapsack), calculando:

O valor máximo possível que pode ser carregado dentro da capacidade da mochila.

Todos os subconjuntos de itens que atingem esse valor máximo.

A solução foi desenvolvida para atividade semanal da disciplina, de forma simples, direta e funcional.

🧠 Método Utilizado

Foi aplicada Programação Dinâmica (PD), com:

Construção de uma tabela dp que armazena o melhor valor possível para cada subcapacidade.

Escala de ×100 para pesos, permitindo trabalhar com valores decimais sem erros de float.

Processo de backtracking para reconstruir todas as combinações de itens que alcançam o valor ótimo.

Remoção de duplicatas garantindo que cada solução seja única.

Esse método garante exatidão, evitando combinações inválidas e retornando todas as respostas corretas.

📁 Arquivos do Projeto

Código principal que realiza todo o processamento: leitura dos dados, construção da programação dinâmica, reconstrução das soluções e impressão dos resultados.
Arquivo referenciado: mochila.py

Arquivo de entrada para testes rápidos, contendo capacidade, quantidade de itens e pares peso/valor.
Arquivo referenciado: entrada.txt 

Conteúdo usado no teste:

50
10
5
10
8
13
12
24
7
14
11
20
20
36
9
18
6
12
15
30
4
8

▶️ Como Executar
1. Execução Interativa

Execute normalmente:

python mochila.py


O programa pedirá:

Capacidade da mochila

Número de itens

Para cada item: peso e valor (floats)

2. Execução Usando Arquivo de Entrada
CMD (funciona direto)
python mochila.py < entrada.txt

PowerShell (forma correta)
Get-Content ./entrada.txt | python ./mochila.py

📥 Formato de Entrada

A entrada deve seguir esta ordem:

Capacidade da mochila (float)

Número de itens (inteiro)

Para cada item:

Peso (float)

Valor (float)

📤 Formato da Saída

O programa exibe:

Valor máximo possível

Todos os subconjuntos que atingem esse valor, contendo:

Índices dos itens (1 a n)

Peso total

Valor total

Exemplo:

===== RESULTADO =====
Valor máximo possível: 180.0

Subconjuntos ótimos (itens são índices 1..n):

Itens: [2, 3]  |  Peso total: 50  |  Valor total: 180.0

📝 Observações Técnicas

Pesos são convertidos para inteiros ×100 para evitar erros de ponto flutuante.

A busca das soluções ocorre com backtrack.

São eliminadas combinações duplicadas.

Cada item é identificado por índice (1-based) na saída.