import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;

public class TiposVariaveis {

    // Variaveis de tipos primitivos
    byte b;
    short s;
    int i;
    long l;

    //Variaveis de tipos primitivos e partes fracionarias
    double d;
    float f;

    //Valores logicos que armazenam VERDADEIRO ou FALSO
    boolean verdadeiro = true || false;

    //Estrutura para a declaração de uma variavel
    // <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
    // EXEMPLO:
    int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
    int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
    double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

    //Os tipos CONSTANTES
    final double VALOR_DE_PI = 3.14;
    //Eles são definidos pela palavra chave FINAL e não podem ter seu valor alterado;

    //Tipos de classes não primitivos
    String texto;
    Array lista; //Coleção de dados
    Date data = new Date(); // exemplo do tipo CLASSE

}
