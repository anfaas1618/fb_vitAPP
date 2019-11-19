package com.example.asdsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class show_data_activity extends AppCompatActivity {
    TextView tv;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public DatabaseReference ref = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data_activity);
    }
    public  void retrive(View view)
    {
        ref.child("anfaas").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                users value = dataSnapshot.getValue(users.class);
                 tv=findViewById(R.id.gg);
                tv.setText(value.crush);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                tv.setText("fucked up");
            }
        });
    }
    }


