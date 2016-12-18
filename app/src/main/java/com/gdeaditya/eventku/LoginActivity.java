package com.gdeaditya.eventku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText UserName, Password;
    Button Login;
    SharedPreferences Pref;
    SharedPreferences.Editor edit;
    String myusername = "Catur";
    String mypassword = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        UserName = (EditText) findViewById(R.id.UserName);
        Password = (EditText) findViewById(R.id.Password);
        Login = (Button) findViewById(R.id.Login);
        Pref = getSharedPreferences("Pref", MODE_PRIVATE);
        edit = Pref.edit();
        if(Pref.getBoolean("KeepLogin",false)){
            Intent i = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        }
    }

    public void pindahpage(View v){
        if(UserName.getText().toString().equalsIgnoreCase(myusername)&&Password.getText().toString().equals(mypassword)){
            edit.putBoolean("KeepLogin",true);
            edit.commit();
            Intent i = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(),"Masukkan User name dan password dengan benar",Toast.LENGTH_LONG).show();
        }
    }
}
