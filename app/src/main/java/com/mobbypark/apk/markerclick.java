package com.mobbypark.apk;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class markerclick extends Fragment
{
    Button book;
    ImageButton closeActivity;
    TextView parkingName,price;
    boolean flag=true;
    @Nullable

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View mview = inflater.inflate(R.layout.layout_marker,null);
        parkingName = mview.findViewById(R.id.Dt1);
        price = mview.findViewById(R.id.Dt3);
        book = mview.findViewById(R.id.book);
        closeActivity = mview.findViewById(R.id.closeMarkerLayout);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),booking.class);
                startActivity(intent);
                container.setVisibility(View.INVISIBLE);
            }
        });

        closeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setVisibility(View.INVISIBLE);
            }
        });
        return mview;
    }



}
