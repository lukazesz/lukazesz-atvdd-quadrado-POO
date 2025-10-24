//Escreva um código em Java que apresente a classe Quadrado, com o atributo lado e os métodos calcularArea, calcularPerimetro e imprimir. O método imprimir deve mostrar na tela os valores do lado, e da área e do perímetro calculados. Salienta-se que a área de um quadrado é obtida pela fórmula (lado * lado) e o perímetro por (4 * lado).

public class Quadrado {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        int areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    public int calcularPerimetro(){
        int perimetroQuadrado = lado * 4;
        return perimetroQuadrado;
    }

    public String imprimir(){
        return "Lado do quadrado: "+ lado + "\nÀrea do quadrado: " + calcularArea() + "\nPerímetro do quadrado: "+ calcularPerimetro();
    }

}
/* 
Pense no papel de cada método:

O método calcularArea deve pegar o valor do lado e retornar a área (sem alterar o lado).

O método calcularPerimetro deve pegar o valor do lado e retornar o perímetro (também sem alterar o lado).

O método imprimir deve apenas mostrar os valores: o lado, a área e o perímetro.

Reflita sobre o tipo de retorno:

Se você quer usar o resultado de calcularArea() e calcularPerimetro() em um printf, eles precisam retornar o valor calculado (e não ser void).

Não mude o estado do objeto ao calcular:

lado é uma característica fixa do quadrado — não deve ser modificado pelos cálculos.

Os cálculos devem ser feitos a partir dele, não sobrescrevendo-o.

O método imprimir:

Ele deve chamar os métodos de cálculo e exibir os resultados de forma organizada.

Exemplo de raciocínio: “Para imprimir, eu preciso saber o lado, a área e o perímetro. Eu já tenho o lado no atributo, e posso obter a área e o perímetro chamando os métodos.”

Se você aplicar essas ideias, o código vai funcionar do jeito esperado.
*/