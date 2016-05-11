package com.wizardlyshop.foodmaster;

import java.util.HashSet;
import java.util.Iterator;

public class Food {
	String id;	//id로 이미지와 문자열을 모두 참조하도록 한다.
	int matchingCounter;
	
	HashSet <EnumFoodAttribute> attributes;
	
	Food(){
		attributes=new HashSet<EnumFoodAttribute>();
		this.matchingCounter = -1;
	}

	public Food(String id, HashSet<EnumFoodAttribute> argAttributes) {
		this();
		this.id = id;
		Iterator <EnumFoodAttribute>it=argAttributes.iterator();
		while(it.hasNext()){
			attributes.add(it.next());
		}
	}

}
