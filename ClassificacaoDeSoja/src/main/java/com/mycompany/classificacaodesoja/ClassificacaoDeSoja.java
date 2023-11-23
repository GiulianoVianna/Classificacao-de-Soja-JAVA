
package com.mycompany.classificacaodesoja;

/**
 *
 * @author Giuliano Vianna
 */
public class ClassificacaoDeSoja {

    // Limites estabelecidos
    private final double limiteUmidade = 14.0; // 14%
    private final double limiteImpurezas = 1.0; // 1%
    private final double limiteAvariados = 8.0; // 8%
    private final double limiteEsverdeados = 8.0; // 8%
    private final double limiteQuebradosAmassados = 30.0; // 30%

    // Método para calcular o desconto individual e retornar um array com os valores
    public double[] calcularDescontos(double pesoLiquido, double umidade, double impurezas, double avariados, double esverdeados, double quebradosAmassados) {
        double descontoUmidade = umidade > limiteUmidade ? (umidade - limiteUmidade) * pesoLiquido / 100 : 0;
        double descontoImpurezas = impurezas > limiteImpurezas ? (impurezas - limiteImpurezas) * pesoLiquido / 100 : 0;
        double descontoAvariados = avariados > limiteAvariados ? (avariados - limiteAvariados) * pesoLiquido / 100 : 0;
        double descontoEsverdeados = esverdeados > limiteEsverdeados ? (esverdeados - limiteEsverdeados) * pesoLiquido / 100 : 0;
        double descontoQuebradosAmassados = quebradosAmassados > limiteQuebradosAmassados ? (quebradosAmassados - limiteQuebradosAmassados) * pesoLiquido / 100 : 0;

        return new double[]{descontoUmidade, descontoImpurezas, descontoAvariados, descontoEsverdeados, descontoQuebradosAmassados};
    }

    // Método para calcular o peso líquido
    public double calcularPesoLiquido(double pesoBruto, double tara) {
        return pesoBruto - tara;
    }

    public static void main(String[] args) {
        ClassificacaoDeSoja classificacao = new ClassificacaoDeSoja();

        // Exemplo de dados de entrada
        double pesoBruto = 48900; // 1000 kg
        double tara = 19200; // 50 kg
        double umidade = 17; // 15%
        double impurezas = 1.9; // 1.2%
        double avariados = 12; // 9%
        double esverdeados = 13; // 8.5%
        double quebradosAmassados = 35; // 31%

        // Calculando o peso líquido
        double pesoLiquido = classificacao.calcularPesoLiquido(pesoBruto, tara);

        // Calculando os descontos
        double[] descontos = classificacao.calcularDescontos(pesoLiquido, umidade, impurezas, avariados, esverdeados, quebradosAmassados);
        double descontoTotal = 0;
        for (double desconto : descontos) {
            descontoTotal += desconto;
        }

        // Peso líquido com desconto
        double pesoLiquidoComDesconto = pesoLiquido - descontoTotal;

        // Imprimindo os resultados
        System.out.println("Peso Bruto: " + pesoBruto + "kg");
        System.out.println("Tara: " + tara + "kg");
        System.out.println("Peso Líquido (sem desconto): " + pesoLiquido + "kg");

        String[] nomesDescontos = {"Umidade", "Impurezas", "Avariados", "Esverdeados", "Quebrados e Amassados"};
        for (int i = 0; i < descontos.length; i++) {
            if (descontos[i] > 0) {
                System.out.println(nomesDescontos[i] + " - Desconto: " + descontos[i] + "kg (" + (descontos[i] / pesoLiquido * 100) + "%)");
            }
        }

        System.out.println("Desconto Total: " + descontoTotal + "kg (" + (descontoTotal / pesoLiquido * 100) + "%)");
        System.out.println("Peso Líquido (com desconto): " + pesoLiquidoComDesconto + "kg");
    }
}



