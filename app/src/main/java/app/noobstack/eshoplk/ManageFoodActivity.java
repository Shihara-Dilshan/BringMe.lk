package app.noobstack.eshoplk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ManageFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_food);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                if(position == 0){

                    Intent intent = new Intent(ManageFoodActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }
                if(position == 1){

                    Intent intent = new Intent(ManageFoodActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }
                if(position == 2){

                    Intent intent = new Intent(ManageFoodActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }


            }
        };
        ListView listView = (ListView)  findViewById(R.id.categoryList);
        listView.setOnItemClickListener(itemClickListener);
    }
}