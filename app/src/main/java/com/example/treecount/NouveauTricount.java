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

        //Création du spinner Devise
        Spinner spinnerDevise = (Spinner) findViewById(R.id.spinnerDevise);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.devise_array,
                R.layout.spinner_list
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDevise.setAdapter(adapter);
        //Création du spinner Catégorie
        Spinner spinnerCategorie = (Spinner) findViewById(R.id.spinnerCategorie);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this,
                R.array.categorie_array,
                R.layout.spinner_list
        );
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategorie.setAdapter(adapter2);
    }
}