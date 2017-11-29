package com.brianxia.lintcode;

/**
 * @author xiadong
 */
public class StringSearch13 {

    /*
 * @param source: source string to be scanned.
 * @param target: target string containing the sequence of characters to match
 * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
 */
    public int strStr(String source, String target) {
        // write your code here

        if(source == null || target == null)
            return -1;

        if(target.length() == 0)
            return 0;

        int isMatch = -1;
        for(int i = 0; i < source.length();i++){

            if(target.charAt(0) == source.charAt(i)
                    && target.length() <= (source.length() - i)){

                isMatch = i;
                for(int j = 0;j < target.length();j++){
                    if(target.charAt(j) != source.charAt(i+j)){
                        isMatch = -1;
                        break;
                    }
                }

                if(isMatch >= 0)
                    return isMatch;
            }
        }

        return isMatch;
    }


    public static void main(String[] args) {

        StringSearch13 test = new StringSearch13();
        System.out.println(test.strStr("source","target"));

        String sample = "aaa";
        sample.indexOf("ttt");
    }
}
