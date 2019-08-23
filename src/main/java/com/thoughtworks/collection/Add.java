package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //throw new NotImplementedException();
    	int temp = 0;
    	if(leftBorder>rightBorder) {
    		temp = leftBorder;
    		leftBorder=rightBorder;
    		rightBorder = temp;
    	}

    	List<Integer> oddList = new ArrayList<Integer>();
    	for(int i=leftBorder;i<=rightBorder;i++) {
    		if(i%2==0) {
    			oddList.add(i);
    		}
    	}
    	int sum =0;
    	for(Integer j :oddList) {
    		sum+=j;
    	}
    	return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    	int sum=0;
    	for(Integer i:arrayList) {
    		sum+=i*3+2;
    	}
    	return sum;
//        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
