package com.wizardlyshop.foodmaster;

import java.util.HashMap;
import java.util.HashSet;

import android.util.Log;

public class LoadFoodData {
	HashMap <String , Food> hmFoods;
	HashSet <EnumFoodAttribute> tempAttributes;
	StringBuffer tempFoodCode;
	
	LoadFoodData(){
		hmFoods=new HashMap <String , Food>();
		tempAttributes=new HashSet <EnumFoodAttribute>();
		tempFoodCode=new StringBuffer();
	}
	
	public HashMap <String , Food> loadingFoods(){
		////jajangmyeon 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jajangmyeon",new Food("jajangmyeon", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////jengbanjajang 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jengbanjajang",new Food("jengbanjajang", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////ganjajang 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("ganjajang",new Food("ganjajang", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////jjambbong 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);		
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jjambbong",new Food("jjambbong", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////porkcutlet 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("porkcutlet",new Food("porkcutlet", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////spaghetti 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("spaghetti",new Food("spaghetti", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////ramen 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);		
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("ramen",new Food("ramen", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////coolnoodle 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);		
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("coolnoodle",new Food("coolnoodle", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////toast 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("toast",new Food("toast", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////porkbelly 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("porkbelly",new Food("porkbelly", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////jokbal 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.OVEN);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jokbal",new Food("jokbal", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////pizza 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("pizza",new Food("pizza", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////salad 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("salad",new Food("salad", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////cake 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("cake",new Food("cake", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////muffin 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("muffin",new Food("muffin", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////siathodduk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("siathodduk",new Food("siathodduk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////gukbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("gukbap",new Food("gukbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////guksu 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);		
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("guksu",new Food("guksu", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		////shabushabu 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);		
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("shabushabu",new Food("shabushabu", tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		////rawfish 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("rawfish",new Food("rawfish", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////gimbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("gimbap",new Food("gimbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////udon 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("udon",new Food("udon", tempAttributes));
		tempAttributes.clear();	//임시객체 clear			

		////bibimnaengmyeon 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("bibimnaengmyeon",new Food("bibimnaengmyeon", tempAttributes));
		tempAttributes.clear();	//임시객체 clear			

		////kalguksu 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("kalguksu",new Food("kalguksu", tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		////sujebi 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("sujebi",new Food("sujebi", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////jjolmyeon 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jjolmyeon",new Food("jjolmyeon", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////kongguksu 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("kongguksu",new Food("kongguksu", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////tteokbokki 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("tteokbokki",new Food("tteokbokki", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////tteokguk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("tteokguk",new Food("tteokguk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////manduguk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("manduguk",new Food("manduguk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////odeng 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("odeng",new Food("odeng", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////jeyukdupbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jeyukdupbap",new Food("jeyukdupbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////ojingerdupbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("ojingerdupbap",new Food("ojingerdupbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////curry 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("curry",new Food("curry", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////kimchibokkeumbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("kimchibokkeumbap",new Food("kimchibokkeumbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////budaejjigae 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("budaejjigae",new Food("budaejjigae", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////yukgaejang 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("yukgaejang",new Food("yukgaejang", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////kalbitang 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("kalbitang",new Food("kalbitang", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////ttukbaegibulgogi 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("ttukbaegibulgogi",new Food("ttukbaegibulgogi", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////bibimbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("bibimbap",new Food("bibimbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////dolsotbibimbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("dolsotbibimbap",new Food("dolsotbibimbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear		

		////kongnamulgukbap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("kongnamulgukbap",new Food("kongnamulgukbap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////sunjihaejangguk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);		
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("sunjihaejangguk",new Food("sunjihaejangguk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////bossam 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);		
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("bossam",new Food("bossam", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////samhap 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);		
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("samhap",new Food("samhap", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////jeonbokjuk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jeonbokjuk",new Food("jeonbokjuk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////hobakjuk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("hobakjuk",new Food("hobakjuk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////danpatjuk 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("danpatjuk",new Food("danpatjuk", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////bibimguksu 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("bibimguksu",new Food("bibimguksu", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		////jaengbanguksu 생성
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		hmFoods.put("jaengbanguksu",new Food("jaengbanguksu", tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
////////////////////////////////	50개		////////////////////////////////		
// 여기부터는 StringBuffer 객체인 tempFoodCode를 사용함. 음식 구분은 코드 블럭의 상단이 아닌 하단에 있는
// tempFoodCode에 넣는 값으로 확인할 것

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("makguksu");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gamjatang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gomtang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("doenjangguk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("tteokmandutguk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("maeuntang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("miyeokguk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("bugeotguk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("samgyetang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("seolleongtang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("ugeojigalbitang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("haemultang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("kimchijjigae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("doenjangjjigae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("sundubujjigae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("cheonggukjang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gopchangjeongol");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gopchanggui");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dubujeongol");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("mandujeongol");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("bullakjeongol");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("sinseollo");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("galbijjim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dakmaeunjjim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("suyuk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("agwijjim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("haemuljjim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dotorimuk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("japchae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("japchaebap");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("tangpyeongchae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("haeparinaengchae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("galchijorim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("godeungeojorim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dubujorim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("eundaegujorim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("nakjibokkeum");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dubukimchi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("deodeokgui");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dwaejigalbi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("tteokgalbi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("roseupyeonchae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("origui");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dakgalbi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.OVEN);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("saengseongui");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gamjajeon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gyeranmari");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("kimchijeon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("modeumjeon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("bindaetteok");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
////////////////////////////////	100개		////////////////////////////////		

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("pajeon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("haemulpajeon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yukhoe");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("hongeohoemuchim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("ganjanggejang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yangnyumgejang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gyeongdan");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("kkultteok");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("baekseolgi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yaksik");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("hwajeon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gangjeong");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dasik");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.DESSERT);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yakgwa");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dakgangjeong");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("nokcha");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("maesilcha");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("sujeonggwa");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("sikhye");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("omijahwachae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yujacha");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TEADRINK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("insamcha");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TABLEDHOTE);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.FRIED);
		tempAttributes.add(EnumFoodAttribute.OVEN);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("hanjeongsik");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.TABLEDHOTE);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.FRIED);
		tempAttributes.add(EnumFoodAttribute.OVEN);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yeongyangdolsotbap");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("jatjuk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("heugimjajuk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("yachaegopchang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("sundaegopchang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("baeksundae");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("guksujeongol");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("jjimdak");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("nengchaejokbal");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gujeolpan");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("oiseon");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("gungjungtopokki");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("sogalbi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("hwangtaegui");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("bossamkimchi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("broiledeel");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("bulgogi");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("hobaknipssam");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
		
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("bersertang");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("tangsuyuk");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("friedshrimp");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("hamburger");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.MEAL);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("geranjjim");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.FRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("frenchfries");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("barbecuechicken");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("ggochijun");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("dongtaijun");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear

		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("donggrangddeng");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear


		
		
/*		////////지우지 마시오. 추가 음식 생성시 아래꺼 복붙.		
		//속성 부여 1
		tempAttributes.add(EnumFoodAttribute.SOLO);
		tempAttributes.add(EnumFoodAttribute.COUPLE);
		tempAttributes.add(EnumFoodAttribute.FRIEND);
		tempAttributes.add(EnumFoodAttribute.COLLEAGUE);
		//속성 부여 2
		tempAttributes.add(EnumFoodAttribute.SNACK);
		tempAttributes.add(EnumFoodAttribute.MEAL);
		tempAttributes.add(EnumFoodAttribute.RELISHES);
		//속성 부여 3
		tempAttributes.add(EnumFoodAttribute.CRYSPY);
		tempAttributes.add(EnumFoodAttribute.CRUNCHY);
		tempAttributes.add(EnumFoodAttribute.CHEWY);
		tempAttributes.add(EnumFoodAttribute.SOFT);
		tempAttributes.add(EnumFoodAttribute.SOUP);
		//속성 부여 4
		tempAttributes.add(EnumFoodAttribute.BOILED);
		tempAttributes.add(EnumFoodAttribute.FRIED);
		tempAttributes.add(EnumFoodAttribute.OVEN);
		tempAttributes.add(EnumFoodAttribute.CHARCOAL);
		tempAttributes.add(EnumFoodAttribute.UNCOOKED);
		tempAttributes.add(EnumFoodAttribute.STIRFRIED);
		tempAttributes.add(EnumFoodAttribute.STEAMED);
		//속성 부여 5
		tempAttributes.add(EnumFoodAttribute.HOT);
		tempAttributes.add(EnumFoodAttribute.COLD);
		//속성 부여 6
		tempAttributes.add(EnumFoodAttribute.SWEET);
		tempAttributes.add(EnumFoodAttribute.SOUR);
		tempAttributes.add(EnumFoodAttribute.SPICY);
		tempAttributes.add(EnumFoodAttribute.LIGHT);
		tempAttributes.add(EnumFoodAttribute.GREASY);
		tempAttributes.add(EnumFoodAttribute.FISHY);
		tempAttributes.add(EnumFoodAttribute.SALTY);
		//객체 생성 , HashSet hsFoods에 추가
		tempFoodCode.delete(0,tempFoodCode.capacity());	//음식명(코드) 초기화
		tempFoodCode.append("음식코드");		//음식명(코드)를 여기에 넣음.
		hmFoods.put(tempFoodCode.toString(),new Food(tempFoodCode.toString(), tempAttributes));
		tempAttributes.clear();	//임시객체 clear
				
*/		
		
		////	리턴		////
		return hmFoods;
	}
}

