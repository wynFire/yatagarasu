package com.audiencescience.apollo.bidder.web;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class Test {
  private static String algorithm = "RC4";
  static String clearText = "123456789012";
  
  public static void main(String []args) throws Exception {
    byte [] key = "95ogkhimjjj!!*#6sj".getBytes("ASCII");
    String toEncrypt = DatatypeConverter.printHexBinary(clearText.getBytes("ASCII"));
    System.out.println("clear (ascii)        " + clearText);
    System.out.println("clear (hex)          " + toEncrypt);
   
    byte[] toDecrypt = encrypt(toEncrypt, key);
    decrypt(toDecrypt, key);
  }
 
  public static byte[] encrypt(String toEncrypt,  byte [] key) throws Exception {
    Cipher rc4 = Cipher.getInstance(algorithm);
    SecretKeySpec rc4Key = new SecretKeySpec(key, algorithm);
    rc4.init(Cipher.ENCRYPT_MODE, rc4Key);
    byte [] cipherText = rc4.doFinal(clearText.getBytes("ASCII"));
    System.out.println("cipher (hex) is      " + DatatypeConverter.printHexBinary(cipherText));
    return cipherText;
  }
 
  public static String decrypt(byte[] toDecrypt, byte [] key) throws Exception {
    SecretKeySpec rc4Key = new SecretKeySpec(key, algorithm);
    Cipher rc4Decrypt = Cipher.getInstance(algorithm);
    rc4Decrypt.init(Cipher.DECRYPT_MODE, rc4Key);
    byte [] clearText2 = rc4Decrypt.doFinal(toDecrypt);
    System.out.println("decrypted (clear) is " + new String(clearText2, "ASCII"));
    return new String(clearText2, "ASCII");
  }
}
