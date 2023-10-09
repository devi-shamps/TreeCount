package com.example.treecount;

import java.util.Date;

public class ProjetK {



    private String titre;
    private String description;
    private String devise;
    private Date date;

    public ProjetK(String titre, String description, String devise, Date date) {
        this.titre = titre;
        this.description = description;
        this.devise = devise;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProjetK{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", devise='" + devise + '\'' +
                ", date=" + date +
                '}';
    }
}
