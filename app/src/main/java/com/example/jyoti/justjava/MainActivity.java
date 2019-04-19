package com.example.jyoti.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity= 1;
    //int noofcoffee =2;
   // String displaymessage= "TOTAL IS "+ quantity + "THANKYOU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // displayMessageMethod();
    }

    private void displayMessageMethod(String displaymessage) {
//TextView textthank = findViewById( R.id.text_thank);
//textthank.setText(displaymessage);
    }

    private void displaypriceMethod(int value) {
        TextView amount= findViewById(R.id.amount_text);
        amount.setText("total is "+ value + "Thank you!");
        //TextView textthank = findViewById( R.id.text_thank);
    }

    public void sumitOrder(View view) {

       // displayMessageMethod(displaymessage);
        dispay(quantity);
        displaypriceMethod(quantity*3);
    }


    private void dispay(int number) {
        TextView valuetext = (findViewById(R.id.valueno));
        valuetext.setText(""+ number);

    }

    public void incrementMethod(View view) {
        quantity= quantity+1;
//        valuetext.setText(quantity+1);
      dispay(quantity);
    }

    public void decrementMethod(View view) {

        quantity= quantity-1;
       // TextView valuetext = (findViewById(R.id.valueno));
        //    valuetext.setText(quantity-1);
        dispay(quantity);
    }
}
