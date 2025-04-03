package com.example.todolistapp.UI;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.todolistapp.R;
import com.example.todolistapp.databinding.ActivityAddTaskBinding;

public class Add_task extends AppCompatActivity {

    ActivityAddTaskBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityAddTaskBinding.inflate(getLayoutInflater());
        View mview = binding.getRoot();
        setContentView(mview);

        binding.icBack.setOnClickListener(view -> {
            finish();
        });

    }
}