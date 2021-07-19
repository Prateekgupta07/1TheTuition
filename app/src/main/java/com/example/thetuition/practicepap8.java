package com.example.thetuition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class practicepap8 extends AppCompatActivity {
    ListView pdfListView;
    ArrayList<String> pdfName = new ArrayList<>();
    ListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicepap8);
        pdfListView = findViewById(R.id.myPDFList);

        pdfName.add("Rational Numbers level one");
        pdfName.add("Rational Numbers level two");
        pdfName.add("Rational Numbers level three");
        pdfName.add("Rational Numbers level four");
        pdfName.add("Exponents & Powers");
        pdfName.add("Squares and Square Roots");
        pdfName.add("Cube & Cube Roots");
        pdfName.add("Algebraic Expressions  level one");
        pdfName.add("Algebraic Expressions level two");
        pdfName.add("Factorisation");
        pdfName.add("Linear Equations");
        pdfName.add("Percentage & Its Applications");
        pdfName.add("Profit & Loss");
        pdfName.add("Compound Interest");
        pdfName.add("Direct & Inverse Variation");
        pdfName.add("Quadrilaterals");
        pdfName.add("Surface Area & Volume");





        listViewAdapter = new ListViewAdapter(getApplicationContext(), pdfName);
        pdfListView.setAdapter(listViewAdapter);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                String name = pdfName.get(position);
                Intent intent = new Intent(getApplicationContext(), PDFopenerp8.class);
                intent.putExtra("pdf", name);
                startActivity(intent);
            }
        });


    }
}