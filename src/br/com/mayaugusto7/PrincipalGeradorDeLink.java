package br.com.mayaugusto7;

public class PrincipalGeradorDeLink {

    public static void main(String[] args) {

        String link = new GeradorDeLink().gerarLink();
        System.out.println(link);
    }
}
