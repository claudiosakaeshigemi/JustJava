package claudioshigemi.com.justjava;

import android.icu.text.NumberFormat;
import android.os.Build;

import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {


        display(quantity);
        displayPrice(quantity * 5);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(" " + number);
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.txt_total);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    public void increment(View view) {
        quantity += 1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity -= 1;
        display(quantity);
    }

}
