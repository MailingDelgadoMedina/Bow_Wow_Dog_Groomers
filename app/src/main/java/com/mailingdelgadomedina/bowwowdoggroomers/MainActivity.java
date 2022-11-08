package com.mailingdelgadomedina.bowwowdoggroomers;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;


import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
EditText numberEditText;
TextView displayTextView;
CheckBox trimNailsCheckBox,  massageCheckBox, fleaBathCheckBox ;
 Double thirtyPoundsOrLess = 35.00;
 Double greaterThanOrEqualToThirtyLessThanFifty = 45.00;
 Double fiftyPoundsOrMore = 55.00;
NumberFormat numFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberEditText = findViewById(R.id.number_editText);
        displayTextView = findViewById(R.id.display_textView);
        trimNailsCheckBox = findViewById(R.id.trim_nails_CheckBox);
        massageCheckBox = findViewById(R.id.massage_CheckBox);
        fleaBathCheckBox = findViewById(R.id.flea_bath_CheckBox);
        displayTextView.setText("");
        numFormat =  NumberFormat.getCurrencyInstance();

    }
    public void handleReset(View v){
        numberEditText.setText("");
        displayTextView.setText("");
        trimNailsCheckBox.setChecked(false);
        massageCheckBox.setChecked(false);
        fleaBathCheckBox.setChecked(false);

    }
    public void handleCalculate(View v){

 updateUI();
    }


    public void handleOrder(View v){
        Toast.makeText(this, "Your order has been placed!", Toast.LENGTH_SHORT).show();
        numberEditText.setText("");
        displayTextView.setText("");
        trimNailsCheckBox.setChecked(false);
        massageCheckBox.setChecked(false);
        fleaBathCheckBox.setChecked(false);
    }


    public void  handleChecked(View v){

    if(v.getId() == R.id.massage_CheckBox){

        Toast.makeText(this, "Massage", Toast.LENGTH_SHORT).show();
    }else if (v.getId() == R.id.trim_nails_CheckBox){
        Toast.makeText(this, "Trim Nails", Toast.LENGTH_SHORT ).show();
    }else {
        Toast.makeText(this, "Flea Bath", Toast.LENGTH_SHORT).show();
    }
updateUI();
    }















    public void updateUI(){
    String result = "";
    Double subTotal;

    try {

        Double num = Double.parseDouble(numberEditText.getText().toString());

        Double  trimNails = 5.00, massage = 20.00, fleaBath= 10.00;
        result = num.toString();



        if (num < 30 ) {
            if (trimNailsCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess + trimNails;
                result = numFormat.format(subTotal);
            }
            if (massageCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess + massage;
                result = numFormat.format(subTotal);
            }
            if ( fleaBathCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess + fleaBath;
                result = numFormat.format(subTotal);
            }
            if (trimNailsCheckBox.isChecked() && massageCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess + trimNails + massage;
                result = numFormat.format(subTotal);
            }

            if (massageCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess +  massage + fleaBath;
                result = numFormat.format(subTotal);
            }
            if (trimNailsCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess + trimNails +  fleaBath;
                result = numFormat.format(subTotal);
            }

            if (trimNailsCheckBox.isChecked() && massageCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = thirtyPoundsOrLess + trimNails + massage + fleaBath;
                result = numFormat.format(subTotal);
            }
            else if (!trimNailsCheckBox.isChecked() && !massageCheckBox.isChecked() && !fleaBathCheckBox.isChecked()){

                result = numFormat.format(thirtyPoundsOrLess );

            }



        }
        if ( num >= 30 && num < 50) {
            if (trimNailsCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty + trimNails;
                result = numFormat.format(subTotal);
            }
            if (massageCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty + massage;
                result = numFormat.format(subTotal);
            }
            if ( fleaBathCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty + fleaBath;
                result = numFormat.format(subTotal);
            }
            if (trimNailsCheckBox.isChecked() && massageCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty + trimNails + massage;
                result = numFormat.format(subTotal);
            }

            if (massageCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty +  massage + fleaBath;
                result = numFormat.format(subTotal);
            }
            if (trimNailsCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty + trimNails +  fleaBath;
                result = numFormat.format(subTotal);
            }

            if (trimNailsCheckBox.isChecked() && massageCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = greaterThanOrEqualToThirtyLessThanFifty + trimNails + massage + fleaBath;
                result = numFormat.format(subTotal);
            }
            else if (!trimNailsCheckBox.isChecked() && !massageCheckBox.isChecked() && !fleaBathCheckBox.isChecked()){

                result = numFormat.format(greaterThanOrEqualToThirtyLessThanFifty );

            }


        }
        if ( num >= 50 ) {
            if (trimNailsCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore + trimNails;
                result = numFormat.format(subTotal);
            }
            if (massageCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore + massage;
                result = numFormat.format(subTotal);
            }
            if ( fleaBathCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore + fleaBath;
                result = numFormat.format(subTotal);
            }
            if (trimNailsCheckBox.isChecked() && massageCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore + trimNails + massage;
                result = numFormat.format(subTotal);
            }

            if (massageCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore +  massage + fleaBath;
                result = numFormat.format(subTotal);
            }

            if (trimNailsCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore + trimNails +  fleaBath;
                result = numFormat.format(subTotal);
            }

            if (trimNailsCheckBox.isChecked() && massageCheckBox.isChecked() && fleaBathCheckBox.isChecked()) {

                subTotal = fiftyPoundsOrMore + trimNails + massage + fleaBath;
                result = numFormat.format(subTotal);
            }else if (!trimNailsCheckBox.isChecked() && !massageCheckBox.isChecked() && !fleaBathCheckBox.isChecked()){

                result = numFormat.format(fiftyPoundsOrMore );

            }


        }


    }catch (NumberFormatException ex){
        Toast.makeText(this, "Incorrect key", Toast.LENGTH_SHORT).show();
    }finally {
        displayTextView.setText(result);
    }


    }
}