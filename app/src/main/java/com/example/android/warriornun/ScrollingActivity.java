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

        //TODO: replace passing UI state data via Intents with ViewModel

        // Pull in the Intent details received from the DisplaySelectedActivity
        Intent intent = getIntent();
        int nunNameResourceId = intent.getIntExtra(DisplaySelectedActivity.EXTRA_NUN_TITLE,0);
        int nun_header = intent.getIntExtra(DisplaySelectedActivity.EXTRA_NUN_DETAIL_HEADER,0);
        int nun_summary = intent.getIntExtra(DisplaySelectedActivity.EXTRA_NUN_DETAIL_SUMMARY,0);

        // Find the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = findViewById(R.id.toolbar_layout);
        // Get the name of the nun
        String nameOfNun = getResources().getString(nunNameResourceId);
        // Set the toolbar title text to the nun's name
        toolBarLayout.setTitle(nameOfNun);

        Drawable res = getResources().getDrawable(nun_header);
        toolBarLayout.setBackground(res);

        String contentText = getResources().getString(nun_summary);
        TextView content = findViewById(R.id.scrollable_content);
        content.setText(contentText);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, nameOfNun + " is away on an assignment at the moment.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}