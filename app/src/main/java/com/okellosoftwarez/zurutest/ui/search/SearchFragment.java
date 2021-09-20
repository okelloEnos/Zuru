package com.okellosoftwarez.zurutest.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.okellosoftwarez.zurutest.databinding.FragmentNotificationsBinding;
import com.okellosoftwarez.zurutest.databinding.FragmentSearchBinding;
import com.okellosoftwarez.zurutest.ui.account.AccountFragment;
import com.okellosoftwarez.zurutest.ui.message.MessageFragment;
import com.okellosoftwarez.zurutest.ui.model.Category;
import com.okellosoftwarez.zurutest.ui.model.Introduction;
import com.okellosoftwarez.zurutest.ui.model.Item;
import com.okellosoftwarez.zurutest.util.MainRecyclerAdapter;
import com.okellosoftwarez.zurutest.util.VehicleRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    private SearchViewModel searchViewModel;
    private FragmentSearchBinding binding;
    private RecyclerView recyclerViewIntro;
    private RecyclerView recyclerViewVehicle;
    private MainRecyclerAdapter introRecyclerAdapter;
    private VehicleRecyclerAdapter vehicleRecyclerAdapter;
//    private ViewPager viewPager;
//    private TabLayout tabLayout;

    public  void settingUpIntroSection(List<Introduction> list){

        recyclerViewIntro = binding.recyclerViewIntro;
        RecyclerView.LayoutManager layoutManagerIntro = new LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewIntro.setLayoutManager(layoutManagerIntro);
        introRecyclerAdapter = new MainRecyclerAdapter(requireContext(), list);
        recyclerViewIntro.setAdapter(introRecyclerAdapter);
    }

    public  void settingUpVehicleSection(List<Category> list){

        recyclerViewVehicle = binding.recyclerViewVehicle;
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewVehicle.setLayoutManager(layoutManager);
        vehicleRecyclerAdapter = new VehicleRecyclerAdapter(requireContext(), list);
        recyclerViewVehicle.setAdapter(vehicleRecyclerAdapter);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        searchViewModel =
                new ViewModelProvider(this).get(SearchViewModel.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Mitsubishi Delica", "", "Chauffered", "Ksh 2000", "Kayole, Nairobi"));
        categories.add(new Category("Mitsubishi Delica", "", "Chauffered", "Ksh 2000", "Kayole, Nairobi"));
        categories.add(new Category("Mitsubishi Delica", "", "Chauffered", "Ksh 2000", "Kayole, Nairobi"));
        categories.add(new Category("Mitsubishi Delica", "", "Chauffered", "Ksh 2000", "Kayole, Nairobi"));

        List<Introduction> introductionList = new ArrayList<>();
        introductionList.add(new Introduction("Endless Options", "Choose from hundreds of models you wont find anywhere else. Pick" +
                "it up or get it delivered to you."));
        introductionList.add(new Introduction("Endless Options", "Choose from hundreds of models you wont find anywhere else. Pick" +
                "it up or get it delivered to you."));
        introductionList.add(new Introduction("Endless Options", "Choose from hundreds of models you wont find anywhere else. Pick" +
                "it up or get it delivered to you."));
        introductionList.add(new Introduction("Endless Options", "Choose from hundreds of models you wont find anywhere else. Pick" +
                "it up or get it delivered to you."));

        settingUpIntroSection(introductionList);
        settingUpVehicleSection(categories);


        searchViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
