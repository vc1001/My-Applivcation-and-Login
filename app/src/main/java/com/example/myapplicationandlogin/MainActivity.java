package com.example.myapplicationandlogin;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.google);
        imageView2=findViewById(R.id.twitter);
        imageView3=findViewById(R.id.facebook);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening browser", Toast.LENGTH_SHORT).show();
                intent = new Intent(Intent.ACTION_VIEW);
                intent = intent.setData(Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening Twitter", Toast.LENGTH_SHORT).show();
                intent=new Intent(Intent.ACTION_VIEW);
                intent=intent.setData(Uri.parse("https://twitter.com/i/flow/login"));
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening Facebook", Toast.LENGTH_SHORT).show();
                intent=new Intent(Intent.ACTION_VIEW);
                intent=intent.setData(Uri.parse("https://www.facebook.com/login/"));
                startActivity(intent);
            }
        });
    }

}