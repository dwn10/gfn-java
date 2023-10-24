package lzk;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CryptoBeispiel {

    // Hauptmethode zum Testen
    public static void main(String[] args) throws Exception {
        // Ursprungstext, den wir verschlüsseln möchten
        String originalText = "Hallo, das ist ein Test!";

        // Generiere einen geheimen Schlüssel für AES-Verschlüsselung
        SecretKey secretKey = generateSecretKey();

        // Verschlüssle den Text
        String encryptedText = encrypt(originalText, secretKey);
        System.out.println("\nVerschlüsselter Text: " + encryptedText);

        // Entschlüssle den Text
        String decryptedText = decrypt(encryptedText, secretKey);
        System.out.println("\nEntschlüsselter Text: " + decryptedText);
    }

    // Methode zur Generierung eines geheimen Schlüssels für AES-Verschlüsselung
    public static SecretKey generateSecretKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // Schlüssellänge setzen: kann 128, 192 oder 256 sein
        return keyGenerator.generateKey();
    }

    // Methode zur Verschlüsselung eines Textes
    public static String encrypt(String plaintext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Methode zum Entschlüsseln eines Textes
    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
}
