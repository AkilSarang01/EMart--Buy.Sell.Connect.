package com.akilsrg.mgmcete_mart;


import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class view_pdf extends AppCompatActivity {

    ListView availpdf;
    DatabaseReference databaseReference;
    List<uploadpdf> uploadpdfs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);
        String value = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        availpdf=findViewById(R.id.availpdf);
        uploadpdfs=new ArrayList<>();


        viewAllFiles();

        availpdf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                uploadpdf uploadpdf=uploadpdfs.get(i);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setType("application/pdf");
                intent.setData(Uri.parse(uploadpdf.getUrl()));
                startActivity(intent);
            }
        });

    }

    private void viewAllFiles() {

        databaseReference = FirebaseDatabase.getInstance().getReference("uploads");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot postSnapshot : snapshot.getChildren()) {

                    uploadpdf uploadpdf = postSnapshot.getValue(com.akilsrg.mgmcete_mart.uploadpdf.class);
                    uploadpdfs.add(uploadpdf);

                }
                String[] uploads = new String[uploadpdfs.size()];

                for (int i = 0; i < uploads.length; i++) {
                    uploads[i] = uploadpdfs.get(i).getName();
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,uploads){
                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        View v=super.getView(position, convertView, parent);

                        TextView t1=(TextView) v.findViewById(android.R.id.text1);
                        t1.setTextColor(Color.BLACK);

                        return v;
                    }
                };
                availpdf.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}