package Controller.Encryption.Coding.Base64;

import java.io.UnsupportedEncodingException;

/**
 * @author RyuZU
 */
public class CodingBase64 {

    public static String encodeToString(String in, String charset) throws UnsupportedEncodingException {
        //将用户输入字符转换成byte
        byte[] bytes = in.getBytes(charset);
        return java.util.Base64.getEncoder().encodeToString(bytes);
    }

    public static String decodetostring(String in, String charset) throws UnsupportedEncodingException {
        //获取用户输入字符通过base64加密，输出byte数组型值
        byte[] bs64 = java.util.Base64.getDecoder().decode(in);
        //将byte数组转换成String输出
        return new String(bs64, charset);
    }

    public static byte[] encode(byte[] in) {
        return java.util.Base64.getEncoder().encode(in);
    }

    public static byte[] decode(byte[] in){
        return java.util.Base64.getDecoder().decode(in);
    }

    public static String urlEncodeToString(String in, String charset) throws UnsupportedEncodingException {
        //将用户输入字符转换成byte
        byte[] bytes = in.getBytes(charset);
        return java.util.Base64.getUrlEncoder().encodeToString(bytes);
    }

    public static String urlDecodeToString(String in, String charset) throws UnsupportedEncodingException {
        //获取用户输入字符通过base64加密，输出byte数组型值
        byte[] bs64 = java.util.Base64.getUrlDecoder().decode(in);
        //将byte数组转换成String输出
        return new String(bs64, charset);
    }

    public static byte[] urlEncode(byte[] in){
        return java.util.Base64.getUrlEncoder().encode(in);
    }

    public static byte[] urlDecode(byte[] in){
        return java.util.Base64.getUrlDecoder().decode(in);
    }
}
