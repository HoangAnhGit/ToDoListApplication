package com.example.todolistapp.Model.Adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolistapp.databinding.ItemTaskBinding;

public class TaskHolder extends RecyclerView.ViewHolder {
    ItemTaskBinding binding ;

    public TaskHolder(@NonNull  ItemTaskBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }
}
