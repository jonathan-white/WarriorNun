package com.example.android.warriornun;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUN = "com.example.android.warriornun.MESSAGE";
    public static final String EXTRA_NUN_HEADER = "com.example.android.warriornun.HEADER";
    public static final String EXTRA_NUN_SUMMARY = "com.example.android.warriornun.SUMMARY";
    public static final String EXTRA_IMAGE = "com.example.android.warriornun.IMAGE";
    String selected_nun;
    String selected_image;
    String selected_nun_header;
    String selected_nun_summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Nun> listOfNuns = new ArrayList<Nun>();

        listOfNuns.add(new Nun(R.string.name_ava, R.drawable.ava2, R.drawable.warrior_nun_ava_s1_poster,R.drawable.ava, R.string.ava_text));
        listOfNuns.add(new Nun(R.string.name_mary, R.drawable.mary2, R.drawable.warrior_nun_mary_s1_poster,R.drawable.mary, R.string.mary_text));
        listOfNuns.add(new Nun(R.string.name_lilith, R.drawable.lilith2, R.drawable.warrior_nun_lilith_s1_poster,R.drawable.lilith, R.string.lilith_text));
        listOfNuns.add(new Nun(R.string.name_beatrice, R.drawable.beatrice2, R.drawable.warrior_nun_beatrice_s1_poster,R.drawable.beatrice, R.string.beatrice_text));
        listOfNuns.add(new Nun(R.string.name_camila, R.drawable.camila2, R.drawable.warrior_nun_camila_s1_poster,R.drawable.camila, R.string.camila_text));

        NunAdapter adapterForNuns = new NunAdapter(this, listOfNuns);
        ListView listView = (ListView) findViewById(R.id.nun_list);
        listView.setAdapter(adapterForNuns);


    }

    public void selectAva(View view) {

        selected_nun = "Ava";
        selected_nun_header = "@drawable/ava2";
        selected_image = "@drawable/warrior_nun_ava_s1_poster";
        selected_nun_summary = "@string/ava_text";
        Intent intent = new Intent(this, DisplaySelectedActivity.class);
        intent.putExtra(EXTRA_NUN, selected_nun);
        intent.putExtra(EXTRA_NUN_HEADER, selected_nun_header);
        intent.putExtra(EXTRA_IMAGE, selected_image);
        intent.putExtra(EXTRA_NUN_SUMMARY, selected_nun_summary);
        startActivity(intent);

    }

    public void selectMary(View view) {

        selected_nun = "Shotgun Mary";
        selected_nun_header = "@drawable/mary2";
        selected_image = "@drawable/warrior_nun_mary_s1_poster";
        selected_nun_summary = "@string/mary_text";
        Intent intent = new Intent(this, DisplaySelectedActivity.class);
        intent.putExtra(EXTRA_NUN, selected_nun);
        intent.putExtra(EXTRA_NUN_HEADER, selected_nun_header);
        intent.putExtra(EXTRA_IMAGE, selected_image);
        intent.putExtra(EXTRA_NUN_SUMMARY, selected_nun_summary);
        startActivity(intent);
    }

    public void selectLilith(View view) {

        selected_nun = "Lilith";
        selected_nun_header = "@drawable/lilith2";
        selected_image = "@drawable/warrior_nun_lilith_s1_poster";
        selected_nun_summary = "@string/lilith_text";
        Intent intent = new Intent(this, DisplaySelectedActivity.class);
        intent.putExtra(EXTRA_NUN, selected_nun);
        intent.putExtra(EXTRA_NUN_HEADER, selected_nun_header);
        intent.putExtra(EXTRA_IMAGE, selected_image);
        intent.putExtra(EXTRA_NUN_SUMMARY, selected_nun_summary);
        startActivity(intent);
    }

    public void selectBeatrice(View view) {

        selected_nun = "Beatrice";
        selected_nun_header = "@drawable/beatrice2";
        selected_image = "@drawable/warrior_nun_beatrice_s1_poster";
        selected_nun_summary = "@string/beatrice_text";
        Intent intent = new Intent(this, DisplaySelectedActivity.class);
        intent.putExtra(EXTRA_NUN, selected_nun);
        intent.putExtra(EXTRA_NUN_HEADER, selected_nun_header);
        intent.putExtra(EXTRA_IMAGE, selected_image);
        intent.putExtra(EXTRA_NUN_SUMMARY, selected_nun_summary);
        startActivity(intent);
    }

    public void selectCamila(View view) {

        selected_nun = "Camila";
        selected_nun_header = "@drawable/camila2";
        selected_image = "@drawable/warrior_nun_camila_s1_poster";
        selected_nun_summary = "@string/camila_text";
        Intent intent = new Intent(this, DisplaySelectedActivity.class);
        intent.putExtra(EXTRA_NUN, selected_nun);
        intent.putExtra(EXTRA_NUN_HEADER, selected_nun_header);
        intent.putExtra(EXTRA_IMAGE, selected_image);
        intent.putExtra(EXTRA_NUN_SUMMARY, selected_nun_summary);
        startActivity(intent);
    }
}