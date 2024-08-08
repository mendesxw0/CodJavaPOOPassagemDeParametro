package OrientacaoAobjeto.main.test;

import OrientacaoAobjeto.main.dominio.ParametroTipoPrimitivo;
/*
Quando passamos valores de um tipo primitivo para um metodo, nã estamos fazendo
referencia, mas sim uma cópia.

Neste exemplo abaixo, tentamos atribuir os valores das variaveis (s,a) para as variaveis
(numero1, numero2), mas não ouve mudança de valores, pois estamos tentando atribuir valores
primitivos, em metodos.
 */
public class ParametroTipoPrimitivoTest {
    public static void main(String[] args) {
        int s = 100;
        int a = 300;
        ParametroTipoPrimitivo parametro = new ParametroTipoPrimitivo();
        parametro.ParametroPrimitivo(s,a);

        System.out.println("============");
        System.out.println("Número1 Class test. ParametroTipoPrimitivoTest  "+s);
        System.out.println("Número2 Class test. ParametroTipoPrimitivoTest  "+a);

    }

}
