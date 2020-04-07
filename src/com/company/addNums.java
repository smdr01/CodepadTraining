package com.company;

import java.math.BigInteger;
import java.util.List;

public class addNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        str1.append(String.valueOf(l1.val));
        str2.append(String.valueOf(l2.val));
        while(l1.next!=null)
    {
        l1=l1.next;
        str1.append(String.valueOf(l1.val));
    }
        while(l2.next!=null)
        {
            l2=l2.next;
            str2.append(String.valueOf(l2.val));

        }
        BigInteger a = new BigInteger(str1.reverse().toString());
        BigInteger b = new BigInteger(str2.reverse().toString());
        BigInteger ab=a.add(b);

        //int finalAnswer = Integer.parseInt(str1.reverse().toString())+Integer.parseInt(str2.reverse().toString());

        char[] stringArray = String.valueOf(ab).toCharArray();
        ListNode finalList = new ListNode(Character.getNumericValue(stringArray[stringArray.length-1]));
        ListNode oldList = new ListNode(Character.getNumericValue(stringArray[0]));
        ListNode newList = new ListNode(Character.getNumericValue(stringArray[1]));
        for(int i=1;i<stringArray.length;i++)
        {
            newList = new ListNode(Character.getNumericValue(stringArray[i]));
            newList.next=oldList;
            oldList=newList;
        }

    return null;}
}
