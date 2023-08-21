public class MinhaClasse {
    /**
     * main: Método que realiza execução de comandos no programa
     */

    public static void main(String[] args) {
        /*
         * Variáveis:
         * Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
         */
        String primeiroNome = "Fábio";
        String segundoNome = "Matos";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    /*
     * Métodos:
     * TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
     */
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
