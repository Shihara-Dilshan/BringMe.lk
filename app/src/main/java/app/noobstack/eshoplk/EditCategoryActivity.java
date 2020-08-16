package app.noobstack.eshoplk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_category);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmitCategoryChanges);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ManageCategoryActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Your changes have been saved",Toast.LENGTH_SHORT).show();

            }
        });
    }
}