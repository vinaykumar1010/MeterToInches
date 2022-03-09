package com.vinappstudio.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private EditText input ;
   private TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        input = findViewById(R.id.in_meter);
        out = findViewById(R.id.out_inches);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(input.getText().toString().matches("")){

                out.setText(R.string.error_massage);
                    out.setTextColor(getResources().getColor(R.color.red));                  //  Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();

                } else{
                    double meterValue = Double.parseDouble(input.getText().toString());
                    double result = meterValue*39.37;
                    out.setTextColor(getResources().getColor(R.color.black));
                    out.setText(String.format(String.valueOf(result)));
                }



            }
        });
    }
}