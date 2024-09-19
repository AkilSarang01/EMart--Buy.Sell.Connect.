package com.akilsrg.mgmcete_mart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forget_pass extends AppCompatActivity {


    EditText fp_mail;
    Button fp_send;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_forget_pass);

        fp_mail=findViewById(R.id.fp_mail);
        fp_send=findViewById(R.id.rfp_send);
        firebaseAuth=FirebaseAuth.getInstance();


        fp_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.sendPasswordResetEmail(fp_mail.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(forget_pass.this,"Link Sended to your mail",Toast.LENGTH_LONG).show();
                            startActivity(new Intent(forget_pass.this,login.class));
                        }else {
                            Toast.makeText(forget_pass.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
}