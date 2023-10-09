package com.example.treecount;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestionsFrequentes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_frequentes);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        // Créer la structure de données pour les groupes et les éléments
        List<String> groupes = new ArrayList<>();
        HashMap<String, List<String>> groupeElements = new HashMap<>();

        // Ajouter un groupe
        groupes.add("Qu'est ce qu'un treeCount?");

        // Ajouter des éléments pour le groupe
        List<String> elementsGroupe1 = new ArrayList<>();
        elementsGroupe1.add("Un treeCount est une liste partagée de transactions qui permet d'équilibrer ses dépenses au sein d'un groupe d'amis, par exemple lors d'une activité commune, de vacances ou dans une collocation.");
        groupeElements.put(groupes.get(0), elementsGroupe1);

        // Ajouter un autre groupe
        groupes.add("Comment fonctionne TreeCount?");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe2 = new ArrayList<>();
        elementsGroupe2.add("Le groupe rentre ses dépenses, TreeCount calcule les balances de chacun et propose une solution pour équilibrer en minimisant le nombre de remboursements.");
        groupeElements.put(groupes.get(1), elementsGroupe2);

        // Ajouter un autre groupe
        groupes.add("L'application TreeCount est-elle gratuite?");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe3 = new ArrayList<>();
        elementsGroupe3.add("Oui, TreeCount est un outil complètement gratuit.");
        groupeElements.put(groupes.get(2), elementsGroupe3);

        // Ajouter un autre groupe
        groupes.add("Combien de personnes maximum dans un treeCount? Et dans l'app?");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe4 = new ArrayList<>();
        elementsGroupe4.add("50 personnes (moi inclus) par TreeCount, pas de limite de nombre dans l'app.");
        groupeElements.put(groupes.get(3), elementsGroupe4);

        // Ajouter un autre groupe
        groupes.add("Comment, utiliser TreeCount en ligne?");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe5 = new ArrayList<>();
        elementsGroupe2.add("Vous pouvez créer vos Treecounts sur www.treecount.com. Le site fonctionne comme l'application.");
        groupeElements.put(groupes.get(4), elementsGroupe5);

        // Ajouter un autre groupe
        groupes.add("Comment puis-je supprimer un TreeCount?");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe6 = new ArrayList<>();
        elementsGroupe2.add("En ligne, cela n'est pas possible. Meme si vous supprimez les treeCounts de votre mobile, vous serez toujours en mesure d'y acceder via Internet.");
        groupeElements.put(groupes.get(5), elementsGroupe6);

        // Ajouter un autre groupe
        groupes.add("Que se passe-t-il si mon smarthphone est volé, cassé ou perdu?");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe7 = new ArrayList<>();
        elementsGroupe2.add("Dans ce cas de figure, nous pouvons restaurez vos données si vous avez synchronisé et partagé votre treecount au prealable");
        groupeElements.put(groupes.get(6), elementsGroupe7);

        // Ajouter un autre groupe
        groupes.add("titre8");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe8 = new ArrayList<>();
        elementsGroupe2.add("explication 8");
        groupeElements.put(groupes.get(7), elementsGroupe8);

        // Ajouter un autre groupe
        groupes.add("titre 9");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe9 = new ArrayList<>();
        elementsGroupe2.add("Explication 9");
        groupeElements.put(groupes.get(8), elementsGroupe9);

        // Ajouter un autre groupe
        groupes.add("titre 10");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe10 = new ArrayList<>();
        elementsGroupe2.add("Explication 10");
        groupeElements.put(groupes.get(9), elementsGroupe10);

        // Ajouter un autre groupe
        groupes.add("titre 11");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe11 = new ArrayList<>();
        elementsGroupe2.add("Explication 11");
        groupeElements.put(groupes.get(10), elementsGroupe11);

        // Ajouter un autre groupe
        groupes.add("titre 12");

        // Ajouter des éléments pour ce groupe
        List<String> elementsGroupe12 = new ArrayList<>();
        elementsGroupe2.add("explication 12");
        groupeElements.put(groupes.get(11), elementsGroupe12);

        // Créer un adapter personnalisé
        CustomExpandableListAdapter adapter = new CustomExpandableListAdapter(this, groupes, groupeElements);

        // Configurer l'ExpandableListView avec l'adapter
        expandableListView.setAdapter(adapter);

        // Définir un écouteur pour gérer les clics sur les éléments
        expandableListView.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            // Afficher un toast avec le texte de l'élément cliqué
            Toast.makeText(QuestionsFrequentes.this, groupeElements.get(groupes.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
            return false;
        });
    }
}