package app.noobstack.eshoplk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdminDashActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private AdminDeliveryOrders adminDeliveryOrders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide the top title bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        setContentView(R.layout.activity_admin_dash);
        adminDeliveryOrders = new AdminDeliveryOrders();

        nevigateAdminDash(adminDeliveryOrders);

        bottomNavigationView = findViewById(R.id.adminNavigationBar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.AdminDash:
                        nevigateAdminDash(adminDeliveryOrders);
                        return true;

                    default:
                        break;
                }

                return false;
            }
        });


    }

    public void nevigateAdminDash(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.AdminFragmentContainer, fragment);
        fragmentTransaction.commit();
    }

    public void changeMe(View view){
        Intent intent = new Intent(this, AdminAssignDriver.class);
        startActivity(intent);
    }
}