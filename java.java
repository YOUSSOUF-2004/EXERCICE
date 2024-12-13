Classe Rapport

public class Rapport {
    private int idRapport;
    private String titre;
    private String dateCreation;
    private String typeSupport;

    // Constructeur
    public Rapport(int idRapport, String titre, String dateCreation, String typeSupport) {
        this.idRapport = idRapport;
        this.titre = titre;
        this.dateCreation = dateCreation;
        this.typeSupport = typeSupport;
    }

    // Méthodes
    public void genererRapport() {
        System.out.println("Rapport généré : " + titre);
    }

    public void afficher() {
        System.out.println("Rapport : " + titre + "\nDate : " + dateCreation + "\nType : " + typeSupport);
    }
}


---

Classe DocumentConception

public class DocumentConception {
    private String idDocument;
    private String contenu;

    // Constructeur
    public DocumentConception(String idDocument, String contenu) {
        this.idDocument = idDocument;
        this.contenu = contenu;
    }

    // Méthodes
    public void modifierDocument(String nouveauContenu) {
        this.contenu = nouveauContenu;
        System.out.println("Document " + idDocument + " modifié.");
    }

    public void afficherDocument() {
        System.out.println("Document : " + idDocument + "\nContenu : " + contenu);
    }
}


---

Classe ProblemeDecision

public class ProblemeDecision {
    private int id;
    private String description;
    private String solution;

    // Constructeur
    public ProblemeDecision(int id, String description, String solution) {
        this.id = id;
        this.description = description;
        this.solution = solution;
    }

    // Méthodes
    public void ajouterSolution(String solution) {
        this.solution = solution;
        System.out.println("Solution ajoutée : " + solution);
    }

    public void afficherProbleme() {
        System.out.println("Problème ID: " + id + "\nDescription : " + description + "\nSolution : " + solution);
    }
}


---

Classe OutilsLogiciels

public class OutilsLogiciels {
    private String nomOutil;
    private String version;
    private String licence;

    // Constructeur
    public OutilsLogiciels(String nomOutil, String version, String licence) {
        this.nomOutil = nomOutil;
        this.version = version;
        this.licence = licence;
    }

    // Méthodes
    public void mettreAJour(String nouvelleVersion) {
        this.version = nouvelleVersion;
        System.out.println("Outil " + nomOutil + " mis à jour vers la version " + version);
    }

    public void verifierLicence() {
        System.out.println("Licence de " + nomOutil + " : " + licence);
    }
}


---

Classe Reunion

public class Reunion {
    private int idReunion;
    private String date;
    private String heure;
    private String lieu;

    // Constructeur
    public Reunion(int idReunion, String date, String heure, String lieu) {
        this.idReunion = idReunion;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
    }

    // Méthodes
    public void organiser() {
        System.out.println("Réunion ID: " + idReunion + " organisée le " + date + " à " + heure + " au lieu : " + lieu);
    }

    public void afficherDetails() {
        System.out.println("Réunion ID: " + idReunion + "\nDate: " + date + "\nHeure: " + heure + "\nLieu: " + lieu);
    }
}


---

Gestion des relations entre classes

Ajout de la relation entre Projet et CahierDeCharge

private CahierDeCharge cahierDeCharge;

public void ajouterCahierDeCharge(CahierDeCharge cahier) {
    this.cahierDeCharge = cahier;
    System.out.println("Cahier de charge ajouté au projet : " + nomProjet);
}

public void afficherCahierDeCharge() {
    if (cahierDeCharge != null) {
        cahierDeCharge.afficherCahierDeCharge();
    } else {
        System.out.println("Aucun cahier de charge associé au projet.");
    }
}

