package org.example.poly;

import java.util.HashMap;
import java.util.Map;

public class EncryptCreator {

    public Map<String, IEncrypt> map = new HashMap<>();

    public void addMap(String str, IEncrypt iEncrypt) {
        map.put(str, iEncrypt);
    }
    public IEncrypt getEncryption(String input) {
        return map.get(input);
    }
}
