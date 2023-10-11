package com.example.treecount;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.treecount.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new  ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getResultCode() == 1){
                Intent resultIntent = result.getData();
                if(resultIntent != null){
                    Log.d("Resultat", resultIntent.getSerializableExtra("nouveauProjetTricount").toString() );
                    ProjetK newProjet = (ProjetK) resultIntent.getSerializableExtra("nouveauProjetTricount");
                    Toast.makeText(MainActivity.this, newProjet.toString(), Toast.LENGTH_LONG).show();
                }
            }
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.NewTricount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setNeutralButton("Annuler", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Click sur le boutton Rejoindre un tricount", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("Nouveau tricount", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Click sur le boutton Nouveau tricount", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, NouveauTricount.class);
                        activityResultLauncher.launch(intent);
                    }
                });

                builder.setPositiveButton("Rejoindre un tricount", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Click sur le boutton Annuler", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        ArrayList<ProjetK> projets = new ArrayList<ProjetK>();
        projets.add(new ProjetK("Titre", "desc", "EUR", date));
        projets.add(new ProjetK("test", "desc", "EUR", date));
        projets.add(new ProjetK("moi", "desc", "EUR", date));
        projets.add(new ProjetK("toi", "desc", "EUR", date));



        binding.recyclerViewTriCount.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.recyclerViewTriCount.setLayoutManager(layoutManager);
        binding.recyclerViewTriCount.setFocusable(false);

        RecyclerAdapter myAdapterProjet = new RecyclerAdapter(projets);
        binding.recyclerViewTriCount.setAdapter(myAdapterProjet);

        binding.buttonQuestionFrequente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Question fréquente", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, QuestionsFrequentes.class);
                activityResultLauncher.launch(intent);
            }
        });



    }
}