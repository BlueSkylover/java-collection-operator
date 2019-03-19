package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result =new ArrayList<>();
        for (int i=0; i<array.size();i++)
        {
            int a=array.get(i);
            result.add(a*3);
        }
        return  result;
    }

    public List<String> mapLetter() {
        List<String> result=new ArrayList<>();
        for(int i=0;i<array.size();i++)
        {
            String str=String.valueOf((char)('a'+array.get(i)-1));
            result.add(str);
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result=new ArrayList<>();
        int first=0;
        int second=0;
        for(int i=0;i<array.size();i++)
        {
            int a=array.get(i);
            first=a/26;
            second=a%26;
            if(first==0) {
                if(second!=0) {
                    String str = String.valueOf((char) ('a' + (second - 1)));
                    result.add(str);
                }
                else
                    result.add(" ");
            }
            else
            {
                if(second==0)
                {
                    second=26;
                    String str1=String.valueOf((char)('a'+(first-2)));
                    String str2=str1+String.valueOf((char)( 'a'+(second-1)));
                    result.add(str2);
                }
                else
                {
                    String str1=String.valueOf((char)('a'+(first-1)));
                    String str2=str1+String.valueOf((char)( 'a'+(second-1)));
                    result.add(str2);
                }
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        Collections.sort(array);
        Collections.reverse(array);
        return  array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return  array;
    }
}
