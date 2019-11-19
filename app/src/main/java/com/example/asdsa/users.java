package com.example.asdsa;

import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class users{
        public String crush;
        public String email;

        public users() {
            // Default constructor required for calls to DataSnapshot.getValue(User.class)
        }

        public users(String crush, String email) {
            this.crush = crush;
            this.email = email;
        }


}

