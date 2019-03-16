package com.example.instagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     public EditText etName ,etPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
    }

    public void onRegister (View view) {
        String name = etName.getText().toString();
        String password = etPass.getText().toString();

        if (password.length() != 0 && name.length() != 0) {
            Toast.makeText(this,"Welcome to your Instagram account", Toast.LENGTH_LONG).show();
            etName.setText("");
            etPass.setText("");
        } else {
            Toast.makeText(this,"You must enter your Login info", Toast.LENGTH_LONG).show();
            if (name.length() == 0) {
                InputMethodManager imm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
                imm.showSoftInput(etName, InputMethodManager.SHOW_IMPLICIT);
            }
            if (password.length() == 0) {
                InputMethodManager imm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
                imm.showSoftInput(etPass, InputMethodManager.SHOW_IMPLICIT);
            }
        }
    }
}
