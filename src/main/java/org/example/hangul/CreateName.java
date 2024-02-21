package org.example.hangul;

import java.util.Random;

public class CreateName {

    public static void main(String[] args) {
        String name = generateName();
        System.out.println("Generated name: " + name);
    }

    public static String generateName() {
        // 초성 - 된소리 제외
        char[] cho = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
        // 중성
        char[] jung = {'ㅏ', 'ㅑ', 'ㅓ', 'ㅕ', 'ㅗ', 'ㅛ', 'ㅜ', 'ㅠ', 'ㅡ', 'ㅣ'};
        // 이름 생성
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) { // 이름을 3글자로 구성
            int choIndex = random.nextInt(cho.length);
            int jungIndex = random.nextInt(jung.length);

            // 한글 글자 조합
            char hangul = (char) (0xAC00 + (choIndex * 21 + jungIndex) * 28);
            sb.append(hangul);
        }

        return sb.toString();
    }
}
