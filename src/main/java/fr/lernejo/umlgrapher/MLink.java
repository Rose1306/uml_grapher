package fr.lernejo.umlgrapher;

public class MLink {
    private final String classe_Enfant;
    private final String classe_Parent;
    private final String lien;

    public MLink(Class classe_Parent, Class classe_Enfant, String lien){
        this.classe_Enfant = classe_Enfant.getSimpleName();
        this.classe_Parent = classe_Parent.getSimpleName();
        this.lien = lien;
    }

    public String getChildClass(){
        return this.classe_Enfant;
    }

    public String getParentClass(){
        return this.classe_Parent;
    }
    public String getLink(){
        return this.lien;
    }

}
