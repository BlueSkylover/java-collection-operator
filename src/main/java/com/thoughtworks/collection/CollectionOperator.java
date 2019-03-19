package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
         List<Integer> result=new ArrayList<>();
         if(left<right)
         {
             while (left<=right) {
                 result.add(left);
                 left++;
             }
         }
         else {
             while (left>=right)
             {
                 result.add(left);
                 left--;
             }
         }
         return  result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> even =new ArrayList<>();
        if(left<right)
        {
            while (left<=right)
            {
                if(left%2==0)
                    even.add(left);
                left++;
            }
        }else {
            while (left>=right)
            {
                if(left%2==0)
                    even.add(left);
                left--;
            }
        }
        return  even;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> even = new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
                even.add(array[i]);
        }
        return  even;
    }

    public int popLastElment(int[] array) {
        int len=array.length;
        return array[len-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<firstArray.length;i++){
            for(int j=0;j<secondArray.length;j++){
                if(firstArray[i]==secondArray[j])
                    result.add(firstArray[i]);
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<firstArray.length;i++)
        {
             result.add(firstArray[i]);
        }
        for (int j=0;j<secondArray.length;j++)
        {
            if(result.contains(secondArray[j]))
                continue;
            else
                result.add(secondArray[j]);
        }
        return  result;
    }
}
