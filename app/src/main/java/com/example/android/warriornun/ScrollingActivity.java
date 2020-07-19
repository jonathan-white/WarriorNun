package com.example.android.warriornun;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        Intent intent = getIntent();
        String nun_title = intent.getStringExtra(DisplaySelectedActivity.EXTRA_NUN_DETAIL);
        String nun_header = intent.getStringExtra(DisplaySelectedActivity.EXTRA_NUN_DETAIL_HEADER);
        String nun_summary = intent.getStringExtra(DisplaySelectedActivity.EXTRA_NUN_DETAIL_SUMMARY);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(nun_title);

        int imageResource = getResources().getIdentifier(nun_header, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        toolBarLayout.setBackground(res);

        int textResource = getResources().getIdentifier(nun_summary, null, getPackageName());
        String contentText = getResources().getString(textResource);
        TextView content = findViewById(R.id.scrollable_content);
        content.setText(contentText);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, nun_title + " is away on an assignment at the moment.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}