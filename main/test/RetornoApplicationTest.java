package OrientacaoAobjeto.main.test;

import OrientacaoAobjeto.main.dominio.Retorno;

public class RetornoApplicationTest {
    public static void main(String[] args) {
        Retorno retornar = new Retorno();

        float result = retornar.conta(20 ,10);
        System.out.println(result);
    }
}
