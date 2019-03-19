package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max=arrayList.get(0);
        for(int i=1;i<arrayList.size();i++)
        {
            int a=arrayList.get(i);
            if(max<a)
                max=a;
        }
        return  max;

    }

    public double getMinimum() {
        int min=arrayList.get(0);
        for (int i=1;i<arrayList.size();i++)
        {
            int a=arrayList.get(i);
            if(min>a)
                min=a;
        }
        return  min;
    }

    public double getAverage() {
        double average=0.0;
        double sum=0;
        for(int i=0;i<arrayList.size();i++)
        {
            int a=arrayList.get(i);
            sum+=a;
        }
        average=sum/arrayList.size();
        return  average;
    }

    public double getOrderedMedian() {
        int len=arrayList.size();
        double middle=0.0;
        int index=len/2;
        if(len%2==0)
        {
            middle=(double) (arrayList.get(index)+arrayList.get(index-1))/2;
        }
        else
            middle=arrayList.get(index);
        return  middle;
    }

    public int getFirstEven() {
        int even=0;
        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i)%2==0) {
                even = arrayList.get(i);
                break;
            }
        }
        return  even;
    }

    public int getIndexOfFirstEven() {
        int index=0;
        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i)%2==0) {
                index = i;
                break;
            }
        }
        return  index;
    }

    public boolean isEqual(List<Integer> arrayList2) {
         boolean flag=true;
         int len=arrayList.size();
         for(int i=0;i<len;i++)
         {
             int a=arrayList.get(i);
             if(!arrayList2.contains(a))
                 flag=false;
         }
         return  flag;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double middle=0.0;
        this.arrayList = arrayList;
        int len=arrayList.size();
        if(len%2==0)
        {
            middle=((Integer)singleLink.getNode(len/2)+(Integer) singleLink.getNode(len/2+1))/2.0;
        }
        else
            middle=((Integer)singleLink.getNode(len/2+1))/1.0;
        return  middle;
    }

    public int getLastOdd() {
        int odd=0;
        int len=arrayList.size();
        for(int i=len-1;i>=0;i--)
        {
            if(arrayList.get(i)%2!=0) {
                odd = arrayList.get(i);
                break;
            }
        }
        return  odd;
    }

    public int getIndexOfLastOdd() {
        int index=0;
        int len=arrayList.size();
        for(int i=len-1;i>=0;i--)
        {
            if(arrayList.get(i)%2!=0) {
                index = i;
                break;
            }
        }
        return  index;
    }
}
