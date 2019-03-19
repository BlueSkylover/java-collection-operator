package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array[i].length;j++)
            {
                result.add(array[i][j]);
            }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array[0].length;i++)
        {
            result.add(array[0][i]);
        }

        for(int i=1;i<array.length;i++)
            for(int j=0;j<array[i].length;j++)
            {
                if(result.contains(array[i][j]))
                    continue;
                else
                    result.add(array[i][j]);
            }
        return result;
    }
}
