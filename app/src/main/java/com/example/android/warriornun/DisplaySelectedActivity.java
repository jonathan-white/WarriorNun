package com.example.android.warriornun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplaySelectedActivity extends AppCompatActivity {
    public static final String EXTRA_NUN_DETAIL = "com.example.android.warriornun.TITLE";
    public static final String EXTRA_NUN_DETAIL_HEADER = "com.example.android.warriornun.HEADER";
    public static final String EXTRA_NUN_DETAIL_SUMMARY = "com.example.android.warriornun.CONTENT";
    String nun_name;
    String nun_header;
    String nun_summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_selected);

        Intent intent = getIntent();
        nun_name = intent.getStringExtra(MainActivity.EXTRA_NUN);
        nun_header = intent.getStringExtra(MainActivity.EXTRA_NUN_HEADER);
        nun_summary = intent.getStringExtra(MainActivity.EXTRA_NUN_SUMMARY);
        String image = intent.getStringExtra(MainActivity.EXTRA_IMAGE);

        int imageResource = getResources().getIdentifier(image, null, getPackageName());
        ImageView imageView = findViewById(R.id.nun_image);
        imageView.setImageResource(imageResource);

    }

    public void learnMore(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        intent.putExtra(EXTRA_NUN_DETAIL, nun_name);
        intent.putExtra(EXTRA_NUN_DETAIL_HEADER, nun_header);
        intent.putExtra(EXTRA_NUN_DETAIL_SUMMARY, nun_summary);
        startActivity(intent);
    }


}