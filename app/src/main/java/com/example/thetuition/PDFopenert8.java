package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenert8 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenert8);
        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");
        if (getItem.equals("Rational Numbers")){
            myPDFViewer.fromAsset("Rational Numbers MCQ P 1 8th.pdf").load();
        }
        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents & Powers MCQ P 2 8th.pdf").load();
        }
        if (getItem.equals("Square and Square Roots")){
            myPDFViewer.fromAsset("Square and Square Roots MCQ P 3 8th.pdf").load();
        }
        if (getItem.equals("Cube and Cube Roots")){
            myPDFViewer.fromAsset("Cube And Cube Roots MCQ P 4 8th.pdf").load();
        }
        if (getItem.equals("Algebraic Expressions")){
            myPDFViewer.fromAsset("Algebraic Expressions MCQ P 5 8th.pdf").load();
        }
        if (getItem.equals("Factorisation")){
            myPDFViewer.fromAsset("Factorisation MCQ P 6 8th.pdf").load();
        }
        if (getItem.equals("Linear Equations")){
            myPDFViewer.fromAsset("Linear Equations MCQ P 7 8th.pdf").load();
        }
        if (getItem.equals("Percentage")){
            myPDFViewer.fromAsset("Percentage MCQ P 8 8th.pdf").load();
        }
        if (getItem.equals("Compound Interest")){
            myPDFViewer.fromAsset("Compound Interest MCQ P 9 8th.pdf").load();
        }
        if (getItem.equals("Variations")){
            myPDFViewer.fromAsset("Variations MCQ P 10 8th.pdf").load();
        }
        if (getItem.equals("Mensuration")){
            myPDFViewer.fromAsset("Mensuration MCQ P 11 8th.pdf").load();
        }
    }
}