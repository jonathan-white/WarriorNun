package com.example.android.warriornun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUN_NAME = "com.example.android.warriornun.NUN";
    public static final String EXTRA_NUN_HEADER = "com.example.android.warriornun.HEADER";
    public static final String EXTRA_NUN_IMAGE = "com.example.android.warriornun.IMAGE";
    public static final String EXTRA_NUN_BIO = "com.example.android.warriornun.SUMMARY";

    private NunViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect UI controller to ViewModel
        model = new ViewModelProvider(this).get(NunViewModel.class);

        final ArrayList<Nun> listOfNuns = new ArrayList<>();

        listOfNuns.add(new Nun(R.string.name_ava, R.string.subtitle_ava, R.drawable.ava2, R.drawable.warrior_nun_ava_s1_poster,
                R.drawable.ava, R.string.ava_text));
        listOfNuns.add(new Nun(R.string.name_mary, R.string.subtitle_mary, R.drawable.mary2,
                R.drawable.warrior_nun_mary_s1_poster, R.drawable.mary, R.string.mary_text));
        listOfNuns.add(new Nun(R.string.name_lilith, R.string.subtitle_lilith, R.drawable.lilith2, R.drawable.warrior_nun_lilith_s1_poster,
                R.drawable.lilith, R.string.lilith_text));
        listOfNuns.add(new Nun(R.string.name_beatrice, R.string.subtitle_beatrice, R.drawable.beatrice2,
                R.drawable.warrior_nun_beatrice_s1_poster,R.drawable.beatrice, R.string.beatrice_text));
        listOfNuns.add(new Nun(R.string.name_camila, R.string.subtitle_camila, R.drawable.camila2, R.drawable.warrior_nun_camila_s1_poster,
                R.drawable.camila, R.string.camila_text));

        NunAdapter adapterForNuns = new NunAdapter(this, listOfNuns);
        ListView listView = findViewById(R.id.nun_list);
        listView.setAdapter(adapterForNuns);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            // Get the clicked nun
            Nun nun = listOfNuns.get(position);
            Log.v("Selected Nun: ", "Selected Nun: " + nun);

            model.select(nun);

            //Setup an intent to move to the NunBioActivity
            Intent intent = new Intent(MainActivity.this, NunBioActivity.class);
            intent.putExtra(EXTRA_NUN_NAME, nun.getName());
            intent.putExtra(EXTRA_NUN_HEADER, nun.getHeaderImage());
            intent.putExtra(EXTRA_NUN_IMAGE, nun.getMainImage());
            intent.putExtra(EXTRA_NUN_BIO, nun.getSummary());
            startActivity(intent);
        });
    }
}