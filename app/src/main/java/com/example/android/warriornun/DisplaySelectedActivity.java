package com.example.android.warriornun;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplaySelectedActivity extends AppCompatActivity {
    public static final String EXTRA_NUN_DETAIL = "com.example.android.warriornun.TITLE";
    public static final String EXTRA_NUN_DETAIL_HEADER = "com.example.android.warriornun.HEADER";
    public static final String EXTRA_NUN_DETAIL_SUMMARY = "com.example.android.warriornun.CONTENT";
    int nun_name;
    int nun_header;
    int nun_summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_selected);

        Intent intent = getIntent();
        nun_name = intent.getIntExtra(MainActivity.EXTRA_NUN_NAME, 0);
        nun_header = intent.getIntExtra(MainActivity.EXTRA_NUN_HEADER, 0);
        nun_summary = intent.getIntExtra(MainActivity.EXTRA_NUN_SUMMARY, 0);
        int image = intent.getIntExtra(MainActivity.EXTRA_IMAGE, 0);

        Log.v("ReceivedNunData: ","NunData: " + "{\n" +
                "\nnun_name: " + nun_name + "," +
                "\nnun_header: " + nun_header + "," +
                "\nnun_summary: " + nun_summary + "," +
                "\nimage: " + image + "," +
                "\n}");

//        int imageResource = getResources().getIdentifier(image, null, getPackageName());
        ImageView imageView = findViewById(R.id.nun_image);
        imageView.setImageResource(image);

    }

    public void learnMore(View view) {
        Intent intent = new Intent(DisplaySelectedActivity.this, ScrollingActivity.class);
        intent.putExtra(EXTRA_NUN_DETAIL, nun_name);
        intent.putExtra(EXTRA_NUN_DETAIL_HEADER, nun_header);
        intent.putExtra(EXTRA_NUN_DETAIL_SUMMARY, nun_summary);
        startActivity(intent);
    }


}