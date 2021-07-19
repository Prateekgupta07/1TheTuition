package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenerp7 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenerp7);

        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");
        if (getItem.equals("Integers")){
            myPDFViewer.fromAsset("INTEGER P 1 7TH.pdf").load();
        }
        if (getItem.equals("Fractions")){
            myPDFViewer.fromAsset("Fractions P 2 7th.pdf").load();
        }
        if (getItem.equals("Decimals")){
            myPDFViewer.fromAsset("Decimals P 3 7th.pdf").load();
        }
        if (getItem.equals("Rational Numbers")){
            myPDFViewer.fromAsset("Rational Numbers P 4 7th.pdf").load();
        }
        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents & Powers P 5 7th.pdf").load();
        }
        if (getItem.equals("Algebraic Expressions")){
            myPDFViewer.fromAsset("Algebraic Expressions P 6 7th.pdf").load();
        }
        if (getItem.equals("Linear Expressions")){
            myPDFViewer.fromAsset("Linear Equations P 7 7th.pdf").load();
        }
        if (getItem.equals("Ratio & Proportion")){
            myPDFViewer.fromAsset("RATIO & PROPORTION P 8 7th.pdf").load();
        }
        if (getItem.equals("Percentage & SP CP")){
            myPDFViewer.fromAsset("PERCENTAGE AND SP CP P 9 7th.pdf").load();
        }
        if (getItem.equals("Percentage & its Applications")){
            myPDFViewer.fromAsset("PERCENTAGE & ITS APPLICATIONS P 9 7th.pdf").load();
        }
        if (getItem.equals("Lines & Angles")){
            myPDFViewer.fromAsset("LINES & ANGLES P 10 7th.pdf").load();
        }
        if (getItem.equals("Triangles & its Properties")){
            myPDFViewer.fromAsset("TRIANGLES & ITS PROPERTIES P 11 7th.pdf").load();
        }
        if (getItem.equals("Congruence of triangles")){
            myPDFViewer.fromAsset("Congruence of triangles P 12 7th.pdf").load();
        }
        if (getItem.equals("Perimeter & Area")){
            myPDFViewer.fromAsset("PERIMETER & AREA P 13 7TH.pdf").load();
        }
        if (getItem.equals("Data Handling")){
            myPDFViewer.fromAsset("DATA HANDLING P 14 7TH.pdf").load();
        }
        if (getItem.equals("Bar Graphs")){
            myPDFViewer.fromAsset("BAR GRAPHS P 15 7TH.pdf").load();
        }


    }
}