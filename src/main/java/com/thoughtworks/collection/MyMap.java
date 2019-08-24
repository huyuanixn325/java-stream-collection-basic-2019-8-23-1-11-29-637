package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
        //throw new NotImplementedException();
    	if(array.size()<=0) return null;
    	 Collections.reverse(array);
    	 return array;
    }

    public List<Integer> sortFromSmall() {
    	if(array.size()<=0) return null;
   	 Collections.sort(array);
   	 return array;
    }
}
