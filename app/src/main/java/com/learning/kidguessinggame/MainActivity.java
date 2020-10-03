package com.learning.kidguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText userEdittext;
    Button userBtn;
    int Random,userNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEdittext = findViewById(R.id.userET);
        userBtn = findViewById(R.id.btn);

      Random rand = new Random();
        Random = rand.nextInt(20);


        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String userInput = userEdittext.getText().toString();
                userNumber = Integer.parseInt(userInput);

                if (Random<userNumber){
                    Toast.makeText(MainActivity.this,"Enter Lower Number ",Toast.LENGTH_LONG).show();
                }
                else if (Random>userNumber){
                    Toast.makeText(MainActivity.this,"Enter Higher  Number ",Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(MainActivity.this,"Congratulation! You won",Toast.LENGTH_LONG).show();

                    Random rand = new Random();
                    Random = rand.nextInt(20);
                    userEdittext.setText("");

                }

            }
        });
    }
}
