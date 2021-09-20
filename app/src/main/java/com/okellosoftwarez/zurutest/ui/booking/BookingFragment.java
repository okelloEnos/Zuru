package com.okellosoftwarez.zurutest.ui.booking;

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
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.okellosoftwarez.zurutest.databinding.FragmentBookingBinding;
import com.okellosoftwarez.zurutest.databinding.FragmentNotificationsBinding;
import com.okellosoftwarez.zurutest.ui.ActiveFragment;
import com.okellosoftwarez.zurutest.ui.PendingFragment;
import com.okellosoftwarez.zurutest.ui.RejectedFragment;
import com.okellosoftwarez.zurutest.ui.account.AccountFragment;
import com.okellosoftwarez.zurutest.ui.message.MessageFragment;
import com.okellosoftwarez.zurutest.ui.search.MyAdapter;

import java.util.List;

public class BookingFragment extends Fragment {
    private BookingViewModel bookingViewModel;
    private FragmentBookingBinding binding;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    void setTabFragments(List<Fragment> fragment, List<String> strings){

    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookingViewModel =
                new ViewModelProvider(this).get(BookingViewModel.class);

        binding = FragmentBookingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        viewPager = binding.viewPager;
        tabLayout = binding.tab;

        MyAdapter adapter = new MyAdapter(requireActivity().getSupportFragmentManager());
        adapter.addFragment(new PendingFragment(), "PENDING");
        adapter.addFragment(new RejectedFragment(), "REJECTED/CANCELED");
        adapter.addFragment(new ActiveFragment(), "ACTIVE");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        bookingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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
