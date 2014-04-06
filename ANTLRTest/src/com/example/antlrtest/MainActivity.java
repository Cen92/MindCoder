package com.example.antlrtest;

import main.tl.Main;
import main.tl.TLValue;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public BluetoothManager bm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.input_text);
        textView.setAdapter(adapter);
    }

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain", "moveForward();", "moveBackward()"
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendMessage(View view) {
        Main object = new Main();
        //BluetoothManager bm = new BluetoothManager();
        		try {
        	EditText in = (EditText)findViewById(R.id.input_text);
            String source = in.getText().toString();
            TLValue parserOutput = object.main(source);
            
            Intent intent = new Intent(this, SendCodeActivity.class);
            startActivity(intent);
            
        		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
    }
    
}
