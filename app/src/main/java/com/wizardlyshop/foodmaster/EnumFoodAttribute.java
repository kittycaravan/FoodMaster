package com.wizardlyshop.foodmaster;

public enum EnumFoodAttribute {
	ANY				(0x00000000),
	////    속성 부여 1 (총 4 속성)    : 누구와 함께하나요?
	SOLO			(0x00010001),
	COUPLE			(0x00010002),
	FRIEND			(0x00010003),
	COLLEAGUE		(0x00010004),
	////    속성 부여 2 (총 7 속성)    : 식사 타입
	SNACK			(0x00020001),
	MEAL			(0x00020002),
	RELISHES		(0x00020003),
	TABLEDHOTE		(0x00020004),
	TEADRINK		(0x00020005),
	ALCOHOL			(0x00020006),
	DESSERT			(0x00020007),
	////    속성 부여 3 (총 5 속성)    : 어떤 식감을 원하나요?
	CRYSPY			(0x00030001),
	CRUNCHY			(0x00030002),
	CHEWY			(0x00030003),
	SOFT			(0x00030004),
	SOUP			(0x00030005),
	////    속성 부여 4 (총 7 속성)    : 어떤 조리법을 원하나요?
	BOILED			(0x00040001),
	FRIED			(0x00040002),
	OVEN			(0x00040003),
	CHARCOAL		(0x00040004),
	UNCOOKED		(0x00040005),
	STIRFRIED		(0x00040006),
	STEAMED			(0x00040007),
	////    속성 부여 5 (총 2 속성)    : 음식의 온도는?
	HOT				(0x00050001),
	COLD			(0x00050002),
	////    속성 부여 6 (총 7 속성)    : 어떤 맛을 원하나요?
	SWEET			(0x00060001),
	SOUR			(0x00060002),
	SPICY			(0x00060003),
	LIGHT			(0x00060004),
	GREASY			(0x00060005),
	FISHY			(0x00060006),
	SALTY			(0x00060007),
	
	;
	
	private int attributeValue;
	
	EnumFoodAttribute(int attributeValue){
		this.attributeValue=attributeValue;
	}
	int getAttributeValue(){
		return attributeValue;
	}
	
	public boolean equals(EnumFoodAttribute e){
		boolean isEqual=false;
		if(this.attributeValue==e.attributeValue) isEqual=true;
		return isEqual;
	}
	
}
