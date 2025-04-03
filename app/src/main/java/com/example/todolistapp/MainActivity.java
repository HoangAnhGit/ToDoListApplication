package com.example.todolistapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.todolistapp.UI.Add_task;
import com.example.todolistapp.UI.FragmentCalendar;
import com.example.todolistapp.UI.FragmentFocus;
import com.example.todolistapp.UI.FragmentIndex;
import com.example.todolistapp.UI.FragmentSetting;
import com.example.todolistapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final int INDEX_FRAGMENT = R.id.index;
    private final int FOCUS_FRAGMENT = R.id.focus;
    private final int CALENDAR_FRAGMENT = R.id.calendar;
    private final int SETTING_FRAGMENT = R.id.settings;


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View mview = binding.getRoot();
        setContentView(mview);

        replaceFragment(new FragmentIndex());
        TransactionFragment();

        binding.floatingActionButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, Add_task.class);
            startActivity(intent);
        });
    }

    private void TransactionFragment() {
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == INDEX_FRAGMENT) {
                replaceFragment(new FragmentIndex());
            } else if (itemId == FOCUS_FRAGMENT) {
                replaceFragment(new FragmentFocus());
            } else if (itemId == CALENDAR_FRAGMENT) {
                replaceFragment(new FragmentCalendar());
            }else if (itemId == SETTING_FRAGMENT) {
                replaceFragment(new FragmentSetting());
            };
            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FragmentLayout, fragment);
        fragmentTransaction.commit();
    }
}
