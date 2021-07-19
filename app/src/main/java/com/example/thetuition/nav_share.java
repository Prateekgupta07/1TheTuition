package com.example.thetuition;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class nav_share extends Fragment {
    Button sharebtn;

    private NavShareViewModel mViewModel;

    public static nav_share newInstance() {
        return new nav_share();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.nav_share_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NavShareViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharebtn = view.findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody="Download this Application Now:-https://drive.google.com/file/d/1zdz-rF9369qxiwN015akinvct7W7f8Z_/view?usp=drivesdk&h1=en";
                String sharesub="The Tuition";
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(shareIntent,"Share Using"));
            }
        });
    }
}