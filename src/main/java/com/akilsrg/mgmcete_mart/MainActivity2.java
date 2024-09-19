package com.akilsrg.mgmcete_mart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity2 extends AppCompatActivity {

    EditText rg_email,rg_pass;
    TextView rg_ald;
    Button rg_sign_up;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        rg_email=findViewById(R.id.rg_mail);
        rg_pass=findViewById(R.id.rg_pass);
        rg_sign_up=findViewById(R.id.rg_signup);
        rg_ald=findViewById(R.id.rg_ald);
        firebaseAuth=FirebaseAuth.getInstance();

        rg_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.createUserWithEmailAndPassword(rg_email.getText().toString(),rg_pass.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity2.this,"Registered Successfully!",Toast.LENGTH_LONG).show();
                            startActivity(new Intent(MainActivity2.this,login.class));
                        }else {
                            Toast.makeText(MainActivity2.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

        rg_ald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,login.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
        FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();

        if (firebaseUser!= null){
            startActivity(new Intent(MainActivity2.this,opt_menu.class));
        }
    }
    }
