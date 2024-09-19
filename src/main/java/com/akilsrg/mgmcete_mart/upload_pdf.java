package com.akilsrg.mgmcete_mart;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;

public class upload_pdf extends AppCompatActivity {

    EditText edtpdfname;
    Button pdfbtn;

    StorageReference storageReference;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_pdf);

        edtpdfname=findViewById(R.id.edtpdfname);
        pdfbtn=findViewById(R.id.pdfbtn);

        storageReference=FirebaseStorage.getInstance().getReference();
        databaseReference= FirebaseDatabase.getInstance().getReference("uploads");

        pdfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectPDFFile();

                if (TextUtils.isEmpty(edtpdfname.getText().toString())) {
                    edtpdfname.setError("Please enter your pdf name first.");
                    edtpdfname.requestFocus();
                    return;
                }
            }
        });
    }
    private void selectPDFFile() {
        Intent i=new Intent();
        i.setType("application/pdf");
        i.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(i,"SELECT PDF FILE"),1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == RESULT_OK
                && data!=null && data.getData()!=null){

            uploadPDFFILE(data.getData());

        }


    }

    private void uploadPDFFILE(Uri data) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading...");
        progressDialog.show();

        StorageReference reference=storageReference.child("uploads/"+System.currentTimeMillis()+".pdf");
        reference.putFile(data)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        Task<Uri> uri = taskSnapshot.getStorage().getDownloadUrl();
                        while (!uri.isComplete());
                        Uri url= uri.getResult();

                        uploadpdf uploadpdf = new uploadpdf(edtpdfname.getText().toString(),url.toString());
                        databaseReference.child(databaseReference.push().getKey()).setValue(uploadpdf);
                    Toast.makeText(upload_pdf.this,"File Uploaded Successfully",Toast.LENGTH_LONG);
                    progressDialog.dismiss();
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                        double progress=(100.0*snapshot.getBytesTransferred())/snapshot.getTotalByteCount();
                        progressDialog.setMessage("Uploaded: "+(int)progress+"%");

                    }
                });

    }

    public void viewpdf(View view) {
        startActivity(new Intent(getApplicationContext(),view_pdf.class));
    }
    }
