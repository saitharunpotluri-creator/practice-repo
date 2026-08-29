package com.demo.crypto;

import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class CryptoDemo {

    public void runLegacyCrypto() throws Exception {
        // 1. Quantum Vulnerable: RSA Key Generation
        KeyPairGenerator rsaKpg = KeyPairGenerator.getInstance("RSA");
        rsaKpg.initialize(2048);

        // 2. Quantum Vulnerable: Elliptic Curve Key Generation
        KeyPairGenerator ecKpg = KeyPairGenerator.getInstance("EC");

        // 3. Quantum Vulnerable: Diffie-Hellman Key Agreement
        KeyPairGenerator dhKpg = KeyPairGenerator.getInstance("DiffieHellman");

        // 4. Quantum Vulnerable: RSA Cipher Operations
        Cipher rsaCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        // 5. Broken Hash: MD5 Digest
        MessageDigest md5Digest = MessageDigest.getInstance("MD5");

        // 6. Broken Hash: SHA-1 Digest
        MessageDigest sha1Digest = MessageDigest.getInstance("SHA-1");

        // 7. Broken Hash Variant: SHA1 String Literal
        MessageDigest sha1Alt = MessageDigest.getInstance("SHA1");

        // 8. Broken Legacy Cipher: Single DES
        Cipher desCipher = Cipher.getInstance("DES");

        // 9. Broken Legacy Cipher: Triple DES (3DES)
        Cipher des3Cipher = Cipher.getInstance("DESede");

        // 10. Quantum Vulnerable Signature: SHA256 with RSA
        Signature rsaSig = Signature.getInstance("SHA256withRSA");

        // 11. Broken Legacy Signature: MD5 with RSA
        Signature md5Sig = Signature.getInstance("MD5withRSA");

        // 12. Broken Stream Cipher: RC4 / ARCFOUR
        Cipher rc4Cipher = Cipher.getInstance("RC4");
    }
}