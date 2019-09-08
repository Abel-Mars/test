package com.example.newapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder diaglog = new AlertDialog.Builder(MainActivity.this);
                diaglog.setTitle("warning");
                diaglog.setMessage("this is a important thing");
                diaglog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                diaglog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                diaglog.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder diaglog1 = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater =getLayoutInflater();
                final View view1=inflater.inflate(R.layout.new1,null);
                diaglog1.setTitle("登陆界面");
                diaglog1.setView(view1);
                diaglog1.setPositiveButton("Login in", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText e1=(EditText)view1.findViewById(R.id.edit_text1);
                        EditText e2=(EditText)view1.findViewById(R.id.edit_text2);
                        if(e1.getText().toString().equals("abc")&&e2.getText().toString().equals("123")){
                            Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,"your password is wrong",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                diaglog1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                diaglog1.show();

            }
        });
    }
}
