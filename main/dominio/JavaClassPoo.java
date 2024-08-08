package OrientacaoAobjeto.main.dominio;

public class JavaClassPoo {
    public void somar(int n, int m){
        System.out.println("O valor de n é: "+ n);
        System.out.println("O valor de m é: "+ m);
        if (n == 10){
            int somarNumeros = n + m;
            System.out.println(somarNumeros);
            return;
        } else{
            int subtrairNumeros = m - n;
            System.out.println(subtrairNumeros);
            return;
        }
    }
}
