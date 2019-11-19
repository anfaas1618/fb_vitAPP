package com.example.asdsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

EditText name,crush,email;
   final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public  DatabaseReference ref = database.getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void  clickedd(View view)
    { email =findViewById(R.id.mail);
        crush =findViewById(R.id.namewa);
name =findViewById(R.id.editText2);

        String namee=    name.getText().toString();
        String crushh=    crush.getText().toString();
        String emaill=    email.getText().toString();
      writeNewData(namee,crushh,emaill);


        Intent intent =new Intent( this ,show_data_activity.class);
        startActivity(intent);


    }
    private void writeNewData(String userId, String name, String email) {
       users user = new users(name, email);
        ref.child(userId).setValue(user);
    }

}
