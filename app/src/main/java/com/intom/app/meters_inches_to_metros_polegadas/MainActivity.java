package com.intom.app.meters_inches_to_metros_polegadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;
    private TextView multIdTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);
        convertButton = (Button) findViewById(R.id.convertButtonId);
        multIdTest = (TextView) findViewById(R.id.multIdTest);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double multipler = 39.3701;
               double result = 0.0;

               if (enterMeters.getText().equals("")){
                   resultTextView.setText((R.string.error_message));
               }else{
                   double meterValue = Double.parseDouble(enterMeters.getText().toString());
                   result = meterValue * multipler;
                   multIdTest.setText(String.valueOf(meterValue) + " * " + String.valueOf(multipler));

                   //resultTextView.setText(Double.toString(result) + "in");
                   resultTextView.setText(String.format("%.2f", result)+ " in" );
               }




            }
        });
    }
}
