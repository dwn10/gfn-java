package aufgaben;

import java.util.Scanner;

public class CaesarBruteForce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den verschlüsselten Text ein:");
        String encryptedText = scanner.nextLine();
        scanner.close();

        for (int i = 1; i <= 26; i++) {
            String decryptedText = decrypt(encryptedText, i);
            System.out.println("Verschiebung: " + i + ", Entschlüsselter Text: " + decryptedText);
        }
    }

    public static String decrypt(String encryptedText, int shift) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - shift);
                if (c < 'a') {
                    c += 26;
                }
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c - shift);
                if (c < 'A') {
                    c += 26;
                }
            }
            decryptedText.append(c);
        }
        return decryptedText.toString();
    }
}