package org.example.substring;

public class SubString {

    public static void main(String[] args) {
        String originalFilename = "DocStory_test_1.16.0.2_230717230720.zip ";
        int lastUnderBarIndex = originalFilename.lastIndexOf("_");
        String substring = originalFilename.substring(0, lastUnderBarIndex);
        int i = substring.lastIndexOf("_");

        int lastDotIndex = originalFilename.lastIndexOf(".");
        String substring1 = originalFilename.substring(i + 1, lastDotIndex);
        System.out.println(substring1.substring(0,substring1.lastIndexOf("_")));
        System.out.println(substring1.substring(substring1.lastIndexOf("_")+1));
    }

}
