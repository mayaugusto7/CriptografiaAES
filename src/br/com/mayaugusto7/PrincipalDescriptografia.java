package br.com.mayaugusto7;

public class PrincipalDescriptografia {

    public static void main(String[] args) {
        String chave = "MINHACHAVESEGURA";
        DescriptografiaAES aes = new DescriptografiaAES(chave);

        String criptografado = "oRtIfOk04Ah+2TfMC2+YgTQOO6FUGZ24Gx+xBNb/amA=";
        String numeroDoCartao = aes.descriptografia(criptografado);

        System.out.println(numeroDoCartao);
    }
}
