package br.com.mayaugusto7;

public class PrincipalCriptografia {

    public static void main(String[] args) {

        String chave = "MINHACHAVESEGURA";
        CriptografiaAES aes = new CriptografiaAES(chave);

        String numeroDoCartao = "1111222233334444";
        String criptografado = aes.criptografia(numeroDoCartao);

        System.out.println(criptografado);
    }
}
