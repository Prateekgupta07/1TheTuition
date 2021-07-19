package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenert7 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenert7);
        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");
        if (getItem.equals("Integers")){
            myPDFViewer.fromAsset("Integer mcq P 1 7th.pdf").load();
        }
        if (getItem.equals("Fractions")){
            myPDFViewer.fromAsset("Fractions mcq P 2 7th.pdf").load();
        }
        if (getItem.equals("Decimals")){
            myPDFViewer.fromAsset("decimals mcq P 3 7th.pdf").load();
        }
        if (getItem.equals("Rational Numbers")){
            myPDFViewer.fromAsset("rational numbers mcq P 4 7th.pdf").load();
        }
        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents & Powers MCQ P 5 7th.pdf").load();
        }
        if (getItem.equals("Algebraic Expressions")){
            myPDFViewer.fromAsset("Algebraic Expressions mcq P 6 7th.pdf").load();
        }
        if (getItem.equals("Linear Equations")){
            myPDFViewer.fromAsset("Linear Equations MCQ P 7  7th.pdf").load();
        }
        if (getItem.equals("Ratio & Proportion")){
            myPDFViewer.fromAsset("Ratio & Proportion MCQ P 8 7th.pdf").load();
        }
        if (getItem.equals("Percentage & its Applications")){
            myPDFViewer.fromAsset("Percentage & Its Applications MCQ P 9 7th.pdf").load();
        }
        if (getItem.equals("Lines & Angles")){
            myPDFViewer.fromAsset("Lines & Angles MCQ P 10 7th.pdf").load();
        }
        if (getItem.equals("Triangles & Its Properties")){
            myPDFViewer.fromAsset("Triangles & Its Properties MCQ P 11 7th.pdf").load();
        }
        if (getItem.equals("Congruence of Triangles")){
            myPDFViewer.fromAsset("Congruence of Triangles MCQ P 12 7th.pdf").load();
        }
        if (getItem.equals("Perimeter & Area")){
            myPDFViewer.fromAsset("Perimeter & Area MCQ P 13 7th.pdf").load();
        }
    }
}