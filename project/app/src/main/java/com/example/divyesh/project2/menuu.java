package com.example.divyesh.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class menuu extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.main2,menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.item1:
                startActivity(new Intent(this,AdminEmail.class));
                return true;

            case R.id.item2:
                startActivity(new Intent(this,AdminChangePassword.class));
                return true;



            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
