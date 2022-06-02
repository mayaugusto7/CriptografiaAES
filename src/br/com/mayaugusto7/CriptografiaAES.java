package br.com.mayaugusto7;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class CriptografiaAES {

    private static final String ALGORITMO = "AES";
    private final SecretKeySpec secretKey;

    public CriptografiaAES(String secretKey) {
        this.secretKey = new SecretKeySpec(secretKey.getBytes(), ALGORITMO);
    }

    public String criptografia(String textoDescriptografado) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITMO);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(textoDescriptografado.getBytes());

            return base64Encode(encryptedBytes);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | IllegalBlockSizeException |
                 BadPaddingException e) {
            throw new RuntimeException("Falha ao criptografar a mensagem: " + e);
        }
    }

    private String base64Encode(byte[] encryptedBytes) {
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}
