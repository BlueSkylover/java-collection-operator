package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<array.size();i++)
        {
            if(array.get(i)%2==0)
                even.add(array.get(i));
        }
        return even;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.size();i++)
        {
            int a=array.get(i);
            if(a%3==0)
                result.add(a);
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
         List<Integer> result=new ArrayList<>();
         for(int i=0;i<firstList.size();i++)
         {
             if(secondList.contains(firstList.get(i)))
                 result.add(firstList.get(i));
         }
         return  result;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.size();i++)
        {
            int a= array.get(i);
            if(result.contains(a))
                continue;
            else
                result.add(a);
        }
        return  result;
    }
}