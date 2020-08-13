package app.noobstack.eshoplk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide the top title bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        setContentView(R.layout.activity_main);

        navigationBar = findViewById(R.id.navigationBar);
        navigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.cart_ico:
                        Toast.makeText(MainActivity.this, "search Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.search_ico:
                        Toast.makeText(MainActivity.this, "cart Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.order_ico:
                        Toast.makeText(MainActivity.this, "order Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.profile_ico:
                        Toast.makeText(MainActivity.this, "profile Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        break;
                }
                return false;
            }
        });

    }
}