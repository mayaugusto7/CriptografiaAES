package br.com.mayaugusto7;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class DescriptografiaAES {

    private static final String ALGORITMO = "AES";
    private final SecretKeySpec secretKey;

    public DescriptografiaAES(String secretKey) {
        this.secretKey = new SecretKeySpec(secretKey.getBytes(), ALGORITMO);
    }

    public String descriptografia(String textoCriptografado) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITMO);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(base64Decode(textoCriptografado));
            return new String(decryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Falha ao descriptografar a mensagem: " + e);
        }
    }

    private byte[] base64Decode(String textoCriptografado) {
        return Base64.getDecoder().decode(textoCriptografado);
    }
}
