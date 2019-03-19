package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        int start;
        if(leftBorder<rightBorder) {
            if (leftBorder % 2 == 0)
                start =leftBorder;
            else
                start=leftBorder+1;
            for(int i=start;i<=rightBorder;i=i+2)
            {
                sum+=i;
            }
        }
        else
        {
            if(leftBorder%2==0)
                start=leftBorder;
            else
                start=leftBorder-1;
            for(int i=start;i>=rightBorder;i=i-2)
            {
                sum+=i;
            }
        }
        return  sum;
//        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        int start=0;
        int flag=1;
        if(leftBorder<rightBorder) {
            if (leftBorder % 2 == 0)
                start =leftBorder+1;
            else
                start=leftBorder;
            for(int i=start;i<=rightBorder;i=i+2)
            {
                sum+=i;
            }
        }
        else
        {
            if(leftBorder%2==0)
                start=leftBorder-1;
            else
                start=leftBorder;
            for(int i=start;i>=rightBorder;i=i-2)
            {
                sum+=i;
            }
        }
        return  sum;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for(int i=0;i<arrayList.size();i++)
        {
            sum+=arrayList.get(i)*3+2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++)
        {
            int num=arrayList.get(i);
            if(num%2==0)
                result.add(num);
            else
                result.add(num*3+2);
        }
        return  result;
    }

    public double getSumOfProcessedOdds(List<Integer> arrayList) {
        double sum=0;
        for(int i=0;i<arrayList.size();i++)
        {
            int num=arrayList.get(i);
            if(num%2!=0)
                sum+=num*3+5;
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> even=new ArrayList<>();
        double middle=0;
        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i)%2==0)
                even.add(arrayList.get(i));
        }
        int len=even.size();
        if(len%2!=0)
            middle=even.get(len/2);
        else
            middle=(even.get(len/2)+even.get(len/2-1))/2;
        return  middle;

    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum=0;
        int count=0;
        double average=0.0;
        for(int i=0;i<arrayList.size();i++)
        {
            int a=arrayList.get(i);
            if(a%2==0) {
                sum += a;
                count=count+1;
            }
        }
        average=sum/count;
        return  average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++)
        {
            int a=arrayList.get(i);
            if(a%2==0)
                even.add(a);
        }
        boolean flag=false;
        if(even.contains(specialElment))
            flag=true;
        return flag;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> even=new ArrayList<>();
        for (int i=0;i<arrayList.size();i++)
        {
            int a = arrayList.get(i);
            if(a%2==0)
                even.add(a);
        }
        Set<Integer> uniquest=new HashSet<>(even);
        even.clear();
        even.addAll(uniquest);
        return  even;

    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();

        for(int i=0;i<arrayList.size();i++)
        {
            int a=arrayList.get(i);
            if(a%2==0)
                even.add(a);
            else
                odd.add(a);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        even.addAll(odd);
        return  even;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
         List<Integer> result=new ArrayList<>();
         for(int i=0;i<arrayList.size()-1;i++)
         {
             int sum=(arrayList.get(i)+arrayList.get(i+1))*3;
             result.add(sum);
         }
         return  result;
    }
}
