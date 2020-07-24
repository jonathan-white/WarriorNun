package com.example.android.warriornun;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUN_NAME = "com.example.android.warriornun.NUN";
    public static final String EXTRA_NUN_HEADER = "com.example.android.warriornun.HEADER";
    public static final String EXTRA_NUN_SUMMARY = "com.example.android.warriornun.SUMMARY";
    public static final String EXTRA_IMAGE = "com.example.android.warriornun.IMAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Nun> listOfNuns = new ArrayList<Nun>();

        listOfNuns.add(new Nun(R.string.name_ava, R.drawable.ava2, R.drawable.warrior_nun_ava_s1_poster,R.drawable.ava, R.string.ava_text));
        listOfNuns.add(new Nun(R.string.name_mary, R.drawable.mary2, R.drawable.warrior_nun_mary_s1_poster,R.drawable.mary, R.string.mary_text));
        listOfNuns.add(new Nun(R.string.name_lilith, R.drawable.lilith2, R.drawable.warrior_nun_lilith_s1_poster,R.drawable.lilith, R.string.lilith_text));
        listOfNuns.add(new Nun(R.string.name_beatrice, R.drawable.beatrice2, R.drawable.warrior_nun_beatrice_s1_poster,R.drawable.beatrice, R.string.beatrice_text));
        listOfNuns.add(new Nun(R.string.name_camila, R.drawable.camila2, R.drawable.warrior_nun_camila_s1_poster,R.drawable.camila, R.string.camila_text));

        NunAdapter adapterForNuns = new NunAdapter(this, listOfNuns);
        ListView listView = (ListView) findViewById(R.id.nun_list);
        listView.setAdapter(adapterForNuns);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Get the clicked nun
                Nun nun = listOfNuns.get(position);
                Log.v("Selected Nun: ", "Selected Nun: " + nun);

                //Setup an intent to move to the DisplaySelectedActivity
                Intent intent = new Intent(MainActivity.this, DisplaySelectedActivity.class);
                intent.putExtra(EXTRA_NUN_NAME, nun.getName());
                intent.putExtra(EXTRA_NUN_HEADER, nun.getHeaderImage());
                intent.putExtra(EXTRA_IMAGE, nun.getMainImage());
                intent.putExtra(EXTRA_NUN_SUMMARY, nun.getSummary());
                startActivity(intent);
            }
        });
    }
}