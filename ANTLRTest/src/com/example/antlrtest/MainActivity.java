package com.example.antlrtest;

import java.util.ArrayList;

import main.tl.Main;
import main.tl.TLValue;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public BluetoothManager bm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendMessage(View view) {
        Main object = new Main();
        BluetoothManager bm = new BluetoothManager();
        		try {
        	EditText in = (EditText)findViewById(R.id.input_text);
            TextView out = (TextView)findViewById(R.id.output_text);
            String source = in.getText().toString();
            TLValue parserOutput = object.main(source);
            //replace test with output
            String test = "Test";
            bm.addToArray(test);
            
        		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
