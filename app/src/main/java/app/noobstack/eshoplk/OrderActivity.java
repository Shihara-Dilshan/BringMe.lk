package app.noobstack.eshoplk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonIncrement;
    private Button buttonDecrement;
    private TextView countText;
    private TextView basePrice;
    private TextView totalPrice;
    private int count = 1;
    private int price = 320;
    private int deliverTip = 30;
    private int temp ;


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.orderItemIncremement:
                if (count <= 20) {
                    this.count++;
                    countText.setText("count : " + count);
                    price = price + 100;
                    basePrice.setText("Rs. "+ price);
                    temp = price + deliverTip;
                    totalPrice.setText("Rs. "+temp);
                } else {
                    Toast.makeText(this, "Maximum 20 food count is allowed at one time", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.orderItemDecremement:
                if (count > 1) {
                    this.count--;
                    countText.setText("count : " + count);
                    price = price - 100;
                    basePrice.setText("Rs. "+ price);
                    temp = price + deliverTip;
                    totalPrice.setText("Rs. "+temp);
                } else {
                    Toast.makeText(this, "Cannot go beyond the minimum limit", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide the top title bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }


        setContentView(R.layout.activity_order);

        buttonIncrement = findViewById(R.id.orderItemIncremement);
        buttonDecrement = findViewById(R.id.orderItemDecremement);
        countText = findViewById(R.id.counterFoods);
        basePrice = findViewById(R.id.basePrice);
        totalPrice = findViewById(R.id.totalPrice);
        countText.setText("count : " + count);

        buttonIncrement.setOnClickListener(this);
        buttonDecrement.setOnClickListener(this);


    }

    public void paymenthandler(View view) {
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }
}