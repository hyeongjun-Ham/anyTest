package org.example.substring;

public class SubString {

    public static void main(String[] args) {
        String originalFilename = "ds_management_v1.6.0.2_231213.tar";
        int lastUnderBarIndex = originalFilename.lastIndexOf("_");
        String FileNameUntilLastUnderBarIndex = originalFilename.substring(0, lastUnderBarIndex);
        int agentVersionUnderBar = FileNameUntilLastUnderBarIndex.lastIndexOf("_");

        int lastDotIndex = originalFilename.lastIndexOf(".");
        String substring = originalFilename.substring(agentVersionUnderBar + 1, lastDotIndex);
        System.out.println(substring);
    }

}
