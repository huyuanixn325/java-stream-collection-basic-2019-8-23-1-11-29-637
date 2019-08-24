package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        //throw new NotImplementedException();
    	List<Integer> oddList = new ArrayList<Integer>();
    	for(int i:array) {
    		if(i%2==0) {
    			oddList.add(i);
    		}
    	}
    	return oddList;
    	
    }

    public List<Integer> filterMultipleOfThree() {
        //throw new NotImplementedException();\
    	List<Integer> oddList = new ArrayList<Integer>();
    	for(int i:array) {
    		if(i%3==0) {
    			oddList.add(i);
    		}
    	}
    	return oddList;
    }
}
