package com.example.android.warriornun;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import android.widget.TextView;

public class NunBioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        // Pull in the Intent details received from the MainActivity
        Intent intent = getIntent();
        int nunNameResourceId = intent.getIntExtra(MainActivity.EXTRA_NUN_NAME,0);
        int nun_header = intent.getIntExtra(MainActivity.EXTRA_NUN_HEADER,0);
        int nun_summary = intent.getIntExtra(MainActivity.EXTRA_NUN_BIO, 0);
        int nun_image = intent.getIntExtra(MainActivity.EXTRA_NUN_IMAGE, 0);

        // Find the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = findViewById(R.id.toolbar_layout);
        // Get the name of the nun
        String nameOfNun = getResources().getString(nunNameResourceId);

        // Set the toolbar title text to the nun's name
        AppBarLayout appBarLayout = findViewById(R.id.app_bar);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = true;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    toolBarLayout.setTitle(nameOfNun);
                    isShow = true;
                } else if (isShow) {
                    toolBarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });

        Drawable nunHeader = getResources().getDrawable(nun_header);
        toolBarLayout.setBackground(nunHeader);

        String nunBio = getResources().getString(nun_summary);
        TextView content = findViewById(R.id.nun_bio);
        content.setText(nunBio);

        NestedScrollView scrollView = findViewById(R.id.nun_image);
        Drawable nunImage = getResources().getDrawable(nun_image);
        scrollView.setBackground(nunImage);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view,
                nameOfNun + " is away on an assignment at the moment.", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

    }
}