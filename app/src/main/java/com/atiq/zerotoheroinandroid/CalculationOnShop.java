package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculationOnShop extends AppCompatActivity {
    EditText inputBuyingPrice,inputBuyingPrice2,inputSellingPrice,inputProfitPercent;
    Button calculationButton;
    TextView displayProfit,displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_on_shop);

        inputBuyingPrice=findViewById(R.id.buyingPrice);
        inputSellingPrice=findViewById(R.id.sellingPrice);
        calculationButton=findViewById(R.id.calculationButton);
        displayProfit=findViewById(R.id.displayProfit);

        calculationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double b_price = Double.parseDouble(inputBuyingPrice.getText().toString());
                double s_price = Double.parseDouble(inputSellingPrice.getText().toString());
                double profit = s_price - b_price;
                displayProfit.setText("Profit is: "+profit+"\nProfit percentage is: "+(profit/b_price*100)+"%");
            }
        });

//       selling price calculation from profit percentage
        inputBuyingPrice2=findViewById(R.id.buyingPrice2);
        inputProfitPercent=findViewById(R.id.percentProfit);
        calculationButton = findViewById(R.id.calculateButton);
        displayText = findViewById(R.id.displaySellingPrice);

        calculationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double b_price = Double.parseDouble(inputBuyingPrice.getText().toString());
                double percent = Double.parseDouble(inputProfitPercent.getText().toString());
                double s_price = b_price+(b_price*percent/100);
                displayText.setText("Selling price is: "+s_price);
            }
        });

    }
}