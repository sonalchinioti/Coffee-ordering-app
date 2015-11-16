package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
int value=0;
    int bill=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       price(value);
        String priceMessage = "thankz for your order  cups of coffee is " +value + " your bill is " +"$ " +bill;
        priceMessage=priceMessage+"\nThank you !";
        displayMessage(priceMessage);
       // display(value*5);

    }
 public void increment(View view)
 {

     value=value+1;

     display(value);
 }
    public void decrement (View view)
 {

     value=value-1;
     display(value);
 }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    /**
     * This method displays the given price on the screen.
     */

    private int price (int v)
    {
        bill = v*5;
        return bill;
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(  NumberFormat.getCurrencyInstance().format(number));
    }
}