package com.wizardlyshop.foodmaster;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.wizardlyshop.foodmaster.model.TestDto;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class TestActivity extends Activity{
	private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
	private DatabaseReference databaseReference = firebaseDatabase.getReference();
	private Button mButton;
	private TextView tv1;
	private TextView tv2;
	private TextView tv3;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_test);

		mButton = (Button)findViewById(R.id.tb);
		mButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TestDto chatData = new TestDto("호양이", "야옹이사랑");
				databaseReference.child("message").push().setValue(chatData);  // 기본 database 하위 message라는 child에 chatData를 list로 만들기
			}
		});
		tv1 = (TextView)findViewById(R.id.txt_1);
		tv2 = (TextView)findViewById(R.id.txt_2);
		tv3 = (TextView)findViewById(R.id.txt_3);

		databaseReference.child("message").addChildEventListener(new ChildEventListener() {  // message는 child의 이벤트를 수신합니다.
			@Override
			public void onChildAdded(DataSnapshot dataSnapshot, String s) {
				TestDto chatData = dataSnapshot.getValue(TestDto.class);  // chatData를 가져오고
				tv1.setText(chatData.getUserName());
				tv3.setText(chatData.getMessage());
			}

			@Override
			public void onChildChanged(DataSnapshot dataSnapshot, String s) { }

			@Override
			public void onChildRemoved(DataSnapshot dataSnapshot) { }

			@Override
			public void onChildMoved(DataSnapshot dataSnapshot, String s) { }

			@Override
			public void onCancelled(DatabaseError databaseError) { }
		});

	}
}
