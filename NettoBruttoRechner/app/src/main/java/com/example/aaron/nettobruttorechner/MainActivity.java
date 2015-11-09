package com.example.aaron.nettobruttorechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calculate(View view){
        TextView resultText = (TextView) findViewById(R.id.result);
        Spinner mode = (Spinner) findViewById(R.id.mode);
        String check_mode = String.valueOf(mode.getSelectedItem().toString());
        EditText input = (EditText) findViewById(R.id.calculatenumber);
        double inputNumber = Double.parseDouble(String.valueOf(input.getText()));
        EditText tax_percetage = (EditText) findViewById(R.id.tax_percentage);
        double tax = Double.parseDouble(String.valueOf(tax_percetage.getText()));
        if(check_mode.equals("Brutto to netto")){
            String result = Double.toString(Calculation.calcNettoBrutto(inputNumber,tax, true));
            resultText.setText(result);
        } else {
            String result = Double.toString(Calculation.calcNettoBrutto(inputNumber,tax, false));
            resultText.setText(result);
        }
    }
}
