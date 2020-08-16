package app.noobstack.eshoplk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddNewCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_category);

        Button btnAdd = (Button) findViewById(R.id.btnSubmitNewCategory);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FoodCategoryActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"You have successfully added the new food item",Toast.LENGTH_SHORT).show();
            }
        });
    }
}