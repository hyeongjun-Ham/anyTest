package org.example;

import java.util.Random;

public class RandomCodeTest {
    public static void main(String[] args) {
        // Random 객체 생성
        Random random = new Random();

        // A-Z까지의 랜덤 대문자 생성
        char randomChar = (char) ('A' + random.nextInt(26));

        // 0-9999까지의 랜덤 숫자 생성
        int randomNumber = random.nextInt(10000);

        // 생성된 랜덤 대문자와 숫자를 조합
        String randomString = String.format("%c%04d", randomChar, randomNumber);

        // 결과 출력
        System.out.println(randomString);
    }
}
