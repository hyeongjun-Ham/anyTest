package org.example.mac;

import java.util.Random;

public class RandomMacAddressGenerator {
    public static void main(String[] args) {
        String macAddress = generateRandomMacAddress();
        System.out.println("Random MAC Address: " + macAddress);
    }

    public static String generateRandomMacAddress() {
        Random random = new Random();
        byte[] macAddr = new byte[6];
        random.nextBytes(macAddr);

        // MAC 주소의 첫 번째 바이트에서 유니캐스트와 멀티캐스트 비트를 0으로 설정 (옵션)
        macAddr[0] = (byte) (macAddr[0] & (byte) 254);

        // MAC 주소를 16진수 형태의 문자열로 변환
        StringBuilder sb = new StringBuilder(18);
        for (byte b : macAddr) {
            if (sb.length() > 0)
                sb.append(":");
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
