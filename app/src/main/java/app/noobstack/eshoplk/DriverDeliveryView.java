package app.noobstack.eshoplk;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class DriverDeliveryView extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_driver_delivery_view, container, false);
        Button btnMoreDetails=(Button) view.findViewById(R.id.btnMoreDetails);
        btnMoreDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert =new AlertDialog.Builder(getContext());
                alert.setMessage(getString(R.string.Item_name_DriverDescription) +
                        getString(R.string.Item_price_DisplayForDriver));
                alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getContext(), R.string.MoreDetailsDescription,Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });
        return  view;
    }


}