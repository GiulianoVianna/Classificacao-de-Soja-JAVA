# Calculo de Classificação de Soja.

## Descrição
Este programa é projetado para calcular o desconto aplicável sobre o peso líquido da soja com base em vários critérios de qualidade, como umidade, impurezas, grãos avariados, esverdeados e quebrados ou amassados.

## Funcionalidades
- **Calcula o Peso Líquido**: Determina o peso líquido da soja subtraindo a tara do peso bruto.
- **Calcula Descontos Individuais**: Calcula os descontos com base nos limites estabelecidos para umidade, impurezas, grãos avariados, esverdeados e quebrados ou amassados.
- **Calcula Desconto Total e Peso Líquido com Desconto**: Soma todos os descontos individuais para encontrar o desconto total e subtrai do peso líquido para obter o peso final após descontos.

## Como usar
1. **Defina os Dados de Entrada**: Inclua informações como peso bruto, tara e os percentuais de umidade, impurezas, grãos avariados, esverdeados, e quebrados ou amassados.
2. **Execute o Programa**: O programa processará esses dados para calcular o peso líquido e os descontos aplicáveis.

## Limites Estabelecidos para Descontos
- Umidade: 14%
- Impurezas: 1%
- Grãos Avariados: 8%
- Grãos Esverdeados: 8%
- Quebrados e Amassados: 30%

## Exemplo de Uso
```java
ClassificacaoDeSoja classificacao = new ClassificacaoDeSoja();
double pesoBruto = 48900;
double tara = 19200;
double umidade = 17;
double impurezas = 1.9;
double avariados = 12;
double esverdeados = 13;
double quebradosAmassados = 35;
// Cálculos realizados aqui
```

## Resultados
O programa calcula e exibe:
- **Peso Bruto**: Peso total da soja antes de qualquer desconto.
- **Tara**: Peso da embalagem ou recipiente que será subtraído do peso bruto.
- **Peso Líquido (sem desconto)**: Peso da soja após subtrair a tara.
- **Descontos Individuais e Totais**: Cálculo dos descontos baseados em cada critério de qualidade e o total de descontos aplicados.
- **Peso Líquido Final Após Descontos**: Peso líquido da soja após a aplicação de todos os descontos.


