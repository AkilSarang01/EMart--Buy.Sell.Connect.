package com.akilsrg.mgmcete_mart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewEV extends AppCompatActivity {

    Button up_btn;
    RecyclerView rc_view;
    ArrayList<EModel> recyclelist;

    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ev);

        up_btn = findViewById(R.id.up_btn);
        rc_view = findViewById(R.id.rc_view);

        recyclelist = new ArrayList<>();

        database=FirebaseDatabase.getInstance();
        EventAdapter recyclerAdapter = new EventAdapter(recyclelist,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rc_view.setLayoutManager(linearLayoutManager);
        rc_view.addItemDecoration(new DividerItemDecoration(rc_view.getContext(),DividerItemDecoration.VERTICAL));
        rc_view.setNestedScrollingEnabled(false);
        rc_view.setAdapter(recyclerAdapter);

        database.getReference().child("event").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    EModel eModel = dataSnapshot.getValue(EModel.class);
                    recyclelist.add(eModel);
                }

                recyclerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ViewEV.this,create_event.class);
                startActivity(i);

            }
        });

    }
}
