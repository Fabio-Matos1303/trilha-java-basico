public class Operadores {
    public static void main(String[] args) throws Exception {
        String nome = "Fábio";
        String sobrenome = "Matos";

        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        int numero = 5;
        numero++;
        System.out.println(numero);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
