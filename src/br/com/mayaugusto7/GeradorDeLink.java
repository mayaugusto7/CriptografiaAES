package br.com.mayaugusto7;

import java.util.UUID;

public class GeradorDeLink {

    private static final String URL = "http://localhost:3000/blog/";

    public String gerarLink() {
        String codigoAleatorio = UUID.randomUUID().toString();
        return URL + codigoAleatorio;
    }
}
