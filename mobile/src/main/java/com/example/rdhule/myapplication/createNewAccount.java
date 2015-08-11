package com.example.rdhule.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class createNewAccount extends ActionBarActivity implements View.OnClickListener{

    private Button existingUser,newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
        existingUser=(Button)findViewById(R.id.existingUserId);
        newUser=(Button)findViewById(R.id.newUserId);

        newUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.newUserId:
                startActivity(new Intent(this,RegistrationUser.class));
                break;
        }
    }
}
