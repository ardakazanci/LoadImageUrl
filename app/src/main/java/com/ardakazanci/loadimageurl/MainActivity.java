package com.ardakazanci.loadimageurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

	private ImageView imageView;
	private static final String imageUrl = "https://cwsmgmt.corsair.com/newscripts/landing-pages/wallpaper/v4/Wallpaper-v4-2560x1440.jpg";
	private static final String LOG_TAG = MainActivity.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imageView = findViewById(R.id.imageView);

		loadImageUrl();

	}
	
	private void loadImageUrl() {

		Picasso.get().load(imageUrl).placeholder(R.mipmap.ic_launcher)
				.error(R.mipmap.ic_launcher_round)
				.into(imageView, new Callback() {
					@Override
					public void onSuccess() {

						Log.d(LOG_TAG,"Picasso Image Url success.");

					}

					@Override
					public void onError(Exception e) {
						Log.d(LOG_TAG,"Picasso Image Url error.");
					}
				});

	}
}
