public class Main {
    public static void main(String[] args) {

        System.out.println("Rafael");

        //TipoDaVariavel nomeDaVariavel= valorDaVariavel
        //String é um TEXTO
        String nome = "Rafael";
        char sexo = 'M';

        // [] -> Diz que é um array
        // {} -> Indicar um objeto
        char[] textoChar = {'5'};

        //Guardar valores Reais
        double altura = 1.84;
        Double peso = 70.0;
        float alturaPessoa2 = 1.80f;
        Float pesoPessoa3 = 70.0f;
        int numeroCasa = 20;
        Integer numeroAlunos = 1;
        Long numeroGolsDoBraitWaith = 3l;

        //Operadores Aritimeticos
        // + para soma
        // - para subtração
        // * para multiplicação
        // / para divisão

        Integer soma = 5 + 5;
        Integer subtração = 5 - 2;
        Integer multiplicar = 5 * 5;
        Integer dividir = 5 / 5;

        Integer resultadoSoma = soma + subtração;
        Integer resultadoSubtração = soma - subtração;
        Integer resultadoMultiplicar = soma * subtração;
        Integer resultadoDivisão = soma / subtração;

        System.out.println("Valord da divisão é" + resultadoDivisão);
        System.out.println("Valord da multiplicação é" + resultadoMultiplicar);
        System.out.println("Valord da Soma é" + resultadoSoma);
        System.out.println("Valord da Subtração é" + resultadoSubtração);
    }
}