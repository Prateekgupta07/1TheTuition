package com.example.thetuition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class testpap8 extends AppCompatActivity {
    ListView pdfListView;
    ArrayList<String> pdfName = new ArrayList<>();
    ListViewAdapter listViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testpap2);
        pdfListView = findViewById(R.id.myPDFList);
        pdfName.add("Rational Numbers");
        pdfName.add("Exponents & Powers");
        pdfName.add("Square and Square Roots");
        pdfName.add("Cube and Cube Roots");
        pdfName.add("Algebraic Expressions");
        pdfName.add("Factorisation");
        pdfName.add("Linear Equations");
        pdfName.add("Percentage");
        pdfName.add("Compound Interest");
        pdfName.add("Variations");
        pdfName.add("Mensuration");
        listViewAdapter = new ListViewAdapter(getApplicationContext(), pdfName);
        pdfListView.setAdapter(listViewAdapter);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id)
            {
                String name = pdfName.get(position);
                Intent intent = new Intent(getApplicationContext(),PDFopenert8.class);
                intent.putExtra("pdf",name);
                startActivity(intent);
            }
        });
    }
}