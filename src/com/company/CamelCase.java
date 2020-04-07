package com.company;

public class CamelCase {

    public static String camelCase(String str) {
        char[] charArray = str.toCharArray();
        char temporary =Character.toUpperCase(charArray[0]);
        charArray[0]= temporary;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                char temp=charArray[i+1];
                char temp2=Character.toUpperCase(temp);
                charArray[i+1]=temp2;

            }
        }


        String newstr = new String(charArray);
        newstr = newstr.replaceAll(" ", "");
        System.out.println(newstr);
        return newstr;
    }
}

