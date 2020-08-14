package app.noobstack.eshoplk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationBar;

    private CartFragment cartFragment;
    private HomeFragment homeFragment;
    private OrdersFragment ordersFragment;
    private ProfileFragment profileFragment;
    private  SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide the top title bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        setContentView(R.layout.activity_main);

        cartFragment = new CartFragment();
        homeFragment = new HomeFragment();
        ordersFragment = new OrdersFragment();
        profileFragment = new ProfileFragment();
        searchFragment = new SearchFragment();

        navigateFragment(homeFragment);

        navigationBar = findViewById(R.id.navigationBar);
        navigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        navigateFragment(homeFragment);
                        return true;
                    case R.id.search_ico:
                        Toast.makeText(MainActivity.this, "search Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        navigateFragment(searchFragment);
                        return true;
                    case R.id.cart_ico:
                        Toast.makeText(MainActivity.this, "cart Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        navigateFragment(cartFragment);
                        return true;
                    case R.id.order_ico:
                        Toast.makeText(MainActivity.this, "order Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        navigateFragment(ordersFragment);
                        return true;
                    case R.id.profile_ico:
                        Toast.makeText(MainActivity.this, "profile Fragment needs to appear", Toast.LENGTH_SHORT).show();
                        navigateFragment(profileFragment );
                        return true;
                    default:
                        break;
                }
                return false;
            }
        });

    }

    public void navigateFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }

    public void adminDash(View view) {
        Intent intent = new Intent(this, AdminDashActivity.class);
        intent.putExtra("shihara" , 222);
        startActivity(intent);
    }

    public void viewCategory(View view) {
        Toast.makeText(this, "sddsdssd", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ViewCategory.class);
        intent.putExtra("shihara" , 222);
        startActivity(intent);
    }
}