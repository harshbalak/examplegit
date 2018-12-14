package com.example.divyesh.project2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Context;


public class SendNotification extends Fragment {

    Button Batchwise, Individual, All;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.sendnotification,container,false);
        Individual =(Button)v.findViewById(R.id.b6);
        Batchwise = (Button)v.findViewById(R.id.b7);
        All = (Button)v.findViewById(R.id.b8);

        Individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Individual.class);
                getActivity().startActivity(intent);
            }
        });


        Batchwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), BatchWise.class);
                getActivity().startActivity(intent1);
            }
        });

        All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), AllBatch.class);
               getActivity().startActivity(intent2);
            }
        });

    return v;
}
}


