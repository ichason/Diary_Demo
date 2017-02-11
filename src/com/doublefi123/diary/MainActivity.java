package com.doublefi123.diary;

import android.app.Activity;
import android.os.Bundle;

import com.doublefi123.diary.widget.CircularImage;
/**
 * 
 * @author chason
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CircularImage cover_user_photo = (CircularImage) findViewById(R.id.cover_user_photo);
		cover_user_photo.setImageResource(R.drawable.face);
	}
}
