package app.noobstack.eshoplk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ManageCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_category);

        Button btnAddCategory = (Button) findViewById(R.id.btnAddCategory);
        btnAddCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AddNewCategoryActivity.class);
                startActivity(intent);

            }
        });
    }

    public void deleteCategory(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(ManageCategoryActivity.this);
        builder.setTitle("Category Delete Alert!!!!")
                .setMessage("Are you sure, you want to delete this category ? You will lose all the food items under this category")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ManageCategoryActivity.this,"The category has been deleted",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ManageCategoryActivity.this,"The category was not deleted",Toast.LENGTH_SHORT).show();
                    }
                });
        //Creating Alert dialog box
        AlertDialog dialog  = builder.create();
        dialog.show();
    }
    public void editCategory(View view)
    {
        Intent intent = new Intent(getApplicationContext(), EditFoodActivity.class);
        startActivity(intent);
    }
}