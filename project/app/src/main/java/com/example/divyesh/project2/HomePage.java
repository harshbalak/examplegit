package com.example.divyesh.project2;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HomePage extends AppCompatActivity {
    Button Signup;
    Button Login;
    EditText uname, pswd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.homepage);

        Signup = (Button) findViewById(R.id.button5);
        Login = (Button) findViewById(R.id.b1);
        uname = (EditText) findViewById(R.id.uid);
        pswd = (EditText) findViewById(R.id.pwd);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uid = uname.getText().toString();
                String pwd = pswd.getText().toString();

                if (uid.equals("admin") && pwd.equals("admin")) {
                    Toast.makeText(HomePage.this, "LogIn Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomePage.this, Main2Activity.class);
                    startActivity(intent);

                } else if (uid.equals("student") && pwd.equals("student")) {
                    Toast.makeText(HomePage.this, "LogIn Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomePage.this, MainActivity.class);
                    startActivity(intent);

                } else if (uid.equals("staff") && pwd.equals("staff")) {
                    Toast.makeText(HomePage.this, "LogIn Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomePage.this, Main3Activity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(HomePage.this, "LogIn Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });



        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Registration.class);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                startActivity(new Intent(this, About.class));
                return true;

            case R.id.item2:
                startActivity(new Intent(this, Contact.class));
                return true;

            case R.id.item3:
                startActivity(new Intent(this, Gallery.class));
                return true;


            case R.id.item4:
                startActivity(new Intent(this,Course_Details.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}



