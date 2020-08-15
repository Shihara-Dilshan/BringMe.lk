package app.noobstack.eshoplk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationBar;

    private CartFragment cartFragment;
    private HomeFragment homeFragment;
    private OrdersFragment ordersFragment;
    private ProfileFragment profileFragment;
    private SearchFragment searchFragment;
    private ViewPastOrdersFragment viewPastOrdersFragment;
    private ViewProcessingOrdersFragment viewProcessingOrdersFragment;


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
        viewPastOrdersFragment = new ViewPastOrdersFragment();
        viewProcessingOrdersFragment = new ViewProcessingOrdersFragment();


        navigateFragment(homeFragment);

        navigationBar = findViewById(R.id.navigationBar);
        navigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.Home:
                        navigateFragment(homeFragment);
                        return true;
                    case R.id.Search_ico:
                        navigateFragment(searchFragment);
                        return true;
                    case R.id.Cart_ico:
                        navigateFragment(cartFragment);
                        return true;
                    case R.id.Order_ico:
                        navigateFragment(ordersFragment);
                        return true;
                    case R.id.Profile_ico:
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
        startActivity(intent);
        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
    }

    public void viewCategory(View view) {
        Intent intent = new Intent(this, ViewCategory.class);
        startActivity(intent);
        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
    }


    public void ViewPAstOrders(View view) {
        navigateFragment(viewPastOrdersFragment);
    }

    public void ViewOngoingOrders(View view) {
        navigateFragment(viewProcessingOrdersFragment);
    }

    public void editOrder(View view) {
        Intent intent = new Intent(this, EditProcessingOrder.class);
        startActivity(intent);
        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
    }

    public void cancelMsg(View view) {
        Toast.makeText(this, "Your Order has been cancelled", Toast.LENGTH_SHORT).show();
    }
}
