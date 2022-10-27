package fr.lernejo.umlgrapher;

public class UmlType {
    private final Class classes;
    private final String nom_classe;
    private final String nom_pack;

    public UmlType(Class a) {
        this.classes = a;
        this.nom_classe = a.getSimpleName();
        this.nom_pack = a.getPackageName();
    }

    public Class getaClasse() { return this.classes; }

    public String getClassName(){return this.nom_classe;}

    public String getPackageName(){return this.nom_pack;}

}
