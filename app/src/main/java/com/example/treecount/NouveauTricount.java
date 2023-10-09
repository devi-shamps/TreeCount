package com.example.treecount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.treecount.databinding.ActivityNouveauTricountBinding;

import java.util.ArrayList;
import java.util.List;

public class NouveauTricount extends AppCompatActivity {

    private ActivityNouveauTricountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNouveauTricountBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerDevise);
        // Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.devise_array,
                R.layout.spinner_list
        );
        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner.
        spinner.setAdapter(adapter);

    }
}