package claves;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

public class main {
public static void main(String[] args){
try {
MessageDigest md = MessageDigest.getInstance("SHA-256");
String text = "pass1";
md.update(text.getBytes("UTF-8"));
byte[] digest = md.digest();
System.out.println(Base64.encodeBase64(digest));
} catch (Exception ex) {
System.out.println(ex.toString());
}
}
}
