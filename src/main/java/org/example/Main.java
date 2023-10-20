package org.example;

import org.example.poly.Encrypt;
import org.example.poly.IEncrypt;
import org.example.poly.Sha256;
import org.example.poly.Sha512;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

//        String encodedString = "%ED%85%8C%EC%8A%A4%ED%8A%B8"; // URL 인코딩된 문자열
//        String encodedString2 = "test12312"; // URL 인코딩된 문자열
//
//        // URL 디코딩
//        String decodedString = URLDecoder.decode(encodedString2, StandardCharsets.UTF_8);
//        System.out.println(decodedString);
//        // Base64 디코딩
//        byte[] decodedBytes = Base64.getDecoder().decode(decodedString);
//
//        // 결과 출력
//        System.out.println(new String(decodedBytes, StandardCharsets.UTF_8));

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            list.add(i);
//        }
//
//        int sum = list
//                .stream()
//                .mapToInt(i -> i)
//                .sum();
//
//        IEncrypt test = new IEncrypt("256");
//
//        System.out.println(test.encrypt());
//        System.out.println(encrypt.encrypt());
        String input = "Sha512";
        String className = "org.example.poly." + input;
        Class<?> cls = Class.forName(className); // 다음과 같이하면 클래스를 로딩
        IEncrypt encrypt = (IEncrypt) cls.newInstance(); // 해당 클래스 인스턴스 생성

        System.out.println(encrypt.encrypt());
//        Method method = cls.getMethod("encrypt"); // 메소드 로딩( 메소드의 인자값이 String 하나가 들어가 있다)
//        String result = (String) method.invoke(encrypt);// 메소드 인자값인 String 하나를 "야호"라고 넣는다.
//        System.out.println(result);
    }
}