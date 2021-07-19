package com.example.thetuition;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class joinus extends Fragment {
    Button join;
    Button facebook;
    Button instagram;
    Button youtube;
    private JoinusViewModel mViewModel;

    public static joinus newInstance() {
        return new joinus();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.joinus_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(JoinusViewModel.class);
        // TODO: Use the ViewModel
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        join = view.findViewById(R.id.joinus);
        facebook= view.findViewById(R.id.facebook);
        instagram= view.findViewById(R.id.instagram);
        youtube= view.findViewById(R.id.youtube);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://chat.whatsapp.com/Kek0OKpfFCf0xNPG0s4Zgb");
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://www.facebook.com/thetuition111");
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://www.instagram.com/the_tuition?r=nametag");
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://www.youtube.com/channel/UCZM53r4CJWWcG7N425V7GxA");
            }
        });
    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}