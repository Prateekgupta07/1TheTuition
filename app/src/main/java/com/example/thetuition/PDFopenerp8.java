package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenerp8 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenerp8);

        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");

        if (getItem.equals("Rational Numbers level one")){
            myPDFViewer.fromAsset("Rational Numbers P 1 8th.pdf").load();
        }
        if (getItem.equals("Rational Numbers level two")){
            myPDFViewer.fromAsset("Rational Numbers level - 2 P 2 8th.pdf").load();
        }
        if (getItem.equals("Rational Numbers level three")){
            myPDFViewer.fromAsset("Rational Numbers Level - 3 P 3 8th.pdf").load();
        }
        if (getItem.equals("Rational Numbers level four")){
            myPDFViewer.fromAsset("Rational Numbers Level - 4 P 4 8th.pdf").load();
        }
        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents and Powers P 2 8th.pdf").load();
        }
        if (getItem.equals("Squares and Square Roots")){
            myPDFViewer.fromAsset("Square and Square Roots P 3 8th.pdf").load();
        }
        if (getItem.equals("Cube & Cube Roots")){
            myPDFViewer.fromAsset("Cube and Cube Roots P 4 8th.pdf").load();
        }
        if (getItem.equals("Algebraic Expressions  level one")){
            myPDFViewer.fromAsset("Algebraic Expressions P 5 8th.pdf").load();
        }
        if (getItem.equals("Algebraic Expressions level two")){
            myPDFViewer.fromAsset("Algebraic Expression level 2 P 5 8th.pdf").load();
        }
        if (getItem.equals("Factorisation")){
            myPDFViewer.fromAsset("Factorisation P 6 8th.pdf").load();
        }
        if (getItem.equals("Linear Equations")){
            myPDFViewer.fromAsset("Linear Equations P 7 8th.pdf").load();
        }
        if (getItem.equals("Percentage & Its Applications")){
            myPDFViewer.fromAsset("Percentage and Its Applications P 8 8th.pdf").load();
        }
        if (getItem.equals("Profit & Loss")){
            myPDFViewer.fromAsset("Profit & Loss P 9 8th.pdf").load();
        }
        if (getItem.equals("Compound Interest")){
            myPDFViewer.fromAsset("Compound Interest P 10 8th.pdf").load();
        }
        if (getItem.equals("Direct & Inverse Variation")){
            myPDFViewer.fromAsset("Direct And Inverse Variation P 11 8th.pdf").load();
        }
        if (getItem.equals("Quadrilaterals")){
            myPDFViewer.fromAsset("Quadrilaterals P 12 8th.pdf").load();
        }
        if (getItem.equals("Surface Area & Volume")){
            myPDFViewer.fromAsset("Surface Area & Volume P 13 8th.pdf").load();
        }
    }
}