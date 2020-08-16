package app.noobstack.eshoplk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        //hide the top title bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        Button btnAddItem = (Button) findViewById(R.id.btnAddFoodItem);
        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AddNewFoodItemActivity.class);
                startActivity(intent);

            }
        });
    }
    public void deleteItem(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(FoodCategoryActivity.this);
        builder.setTitle("Item Delete Alert")
                .setMessage("Are you sure, you want to delete this item ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FoodCategoryActivity.this,"The food item has been deleted",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FoodCategoryActivity.this,"The item was not deleted",Toast.LENGTH_SHORT).show();
                    }
                });
        //Creating dialog box
        AlertDialog dialog  = builder.create();
        dialog.show();
    }
    public void editItem(View view)
    {
        Intent intent = new Intent(getApplicationContext(), EditFoodActivity.class);
        startActivity(intent);
    }
}