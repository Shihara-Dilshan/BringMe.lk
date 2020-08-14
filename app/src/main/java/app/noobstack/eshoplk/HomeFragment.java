package app.noobstack.eshoplk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class HomeFragment extends Fragment {

    private RecyclerView category;
    private RecyclerView foods;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        category = view.findViewById(R.id.home_categories);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        category.setHasFixedSize(true);
        category.setLayoutManager(layoutManager);

        foods = view.findViewById(R.id.subcategory);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        layoutManager2.setReverseLayout(true);
        layoutManager2.setStackFromEnd(true);
        foods.setHasFixedSize(true);
        foods.setLayoutManager(layoutManager2);
        return view;
    }
}