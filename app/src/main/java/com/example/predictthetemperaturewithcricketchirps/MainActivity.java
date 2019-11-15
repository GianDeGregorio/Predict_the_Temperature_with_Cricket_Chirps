package com.example.predictthetemperaturewithcricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

	EditText edChirps;
	Button btnCalculate;
	TextView tvResults;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		edChirps = findViewById(R.id.edChirps);
		btnCalculate = findViewById(R.id.btnCalculate);
		tvResults=findViewById(R.id.tvResults);

		tvResults.setVisibility(View.GONE);

		btnCalculate.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

			 double nChirps= Double.parseDouble(edChirps.getText().toString().trim());
			 double Results = (nChirps / 3.0)+ 4;

			 String text = "The approximate temperature outside is "+"\n" +
					 		Results +" degrees Celcius.";

			 tvResults.setText(text);
			 tvResults.setVisibility(View.VISIBLE);
			}
		});



	}
}
