package org.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText operand1;
	EditText operand2;
	Button Add, Sub, Mul, Div, Clear;
	TextView textResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		operand1 = (EditText) findViewById(R.id.editText1);
		operand2 = (EditText) findViewById(R.id.editText2);
		
		Add = (Button) findViewById(R.id.buttonAdd);
		Sub = (Button) findViewById(R.id.buttonSub);
		Mul = (Button) findViewById(R.id.buttonMul);
		Div = (Button) findViewById(R.id.buttonDiv);
		Clear= (Button) findViewById(R.id.Clear);
		
		textResult= (TextView) findViewById(R.id.textResult);
		
		Add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float x=Float.parseFloat(operand1.getText().toString());
				float y=Float.parseFloat(operand2.getText().toString());
				
				float res=x+y;
				
				textResult.setText(Float.toString(res));
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		Sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float x=Float.parseFloat(operand1.getText().toString());
				float y=Float.parseFloat(operand2.getText().toString());
				
				float res=x-y;
				
				textResult.setText(Float.toString(res));
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		Mul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float x=Float.parseFloat(operand1.getText().toString());
				float y=Float.parseFloat(operand2.getText().toString());
				
				float res=x*y;
				
				textResult.setText(Float.toString(res));
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		Div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float x=Float.parseFloat(operand1.getText().toString());
				float y=Float.parseFloat(operand2.getText().toString());
				
				float res=x/y;
				
				textResult.setText(Float.toString(res));
				
				
				// TODO Auto-generated method stub
				
			}
		});

		Clear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				operand1.setText("");
				operand2.setText("");
				textResult.setText("0.0");
				
				
				// TODO Auto-generated method stub
				
			}
		});

		
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
