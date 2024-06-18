import com.sun.source.tree.IfTree;

public class Operadores {
    public static void main(String[] args) {

        //Operador de atribuição, definido pelo sinal de =
        int nota = 10;

        //Operadores aritmeticos
        int soma = 10 + 10; //Soma pelo sinal de +
        int subtracao = 10 - 20; //Subtração pelo sinal de -
        int mulplicacao = 10 * 10; // Multiplicação pelo sinal de *
        int divisao = 10 / 10; // Divisão pelo sinal de /
        int modulo = 19 % 3; //Resto da divisão

        //Operador de concatenação
        String nomeCompleto = "Renan" + "Bispo";

        //Operadores UNARIOS
        //(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        int num = 5;
        //(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        int num2 = -5;
        //(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        System.out.println(num++);
        //(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        System.out.println(num--);
        //(!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
        boolean verdadeiro = true;
        System.out.println(!verdadeiro);

        //Operadores ternários
        int a = 5;
        int b = 6;
        //O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
        String resultado = (a==b) ? "verdadeiro" : "false";

        //Operadores relacionais
        //== Quando desejamos verificar se uma variável é IGUAL A outra.
        if (a == b) System.out.println("A é igual B");
        //!= Quando desejamos verificar se uma variável é DIFERENTE da outra.
        if (a != b) System.out.println("A é diferente de B");
        //> Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        if (a > b) System.out.println("A é maior que B");
        //>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        if (a >= b) System.out.println("A é maior ou igual B");
        //< Quando desejamos verificar se uma variável é MENOR QUE outra.
        if (a < b) System.out.println("A é menor que B");
        //<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        if (a <= b) System.out.println("A é menor ou igual B");

        //Operadores lógicos
        //Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.
        boolean condicao1=true;
        boolean condicao2=false;
        //&& Operador Lógico "E"
        if(condicao1 && condicao2) System.out.print("Os dois valores precisam ser verdadeiros");
        //|| Operador Lógico "OU"
        if(condicao1 || condicao2) System.out.print("Um dos valores precisa ser verdadeiro");
    }
}