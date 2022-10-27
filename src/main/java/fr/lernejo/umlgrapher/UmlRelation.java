package fr.lernejo.umlgrapher;
import java.util.Set;

public class UmlRelation {
    private final Set<UmlType> Tree;
    public UmlRelation(Set<UmlType> arbre) {this.Tree = arbre;}
    public Set<MLink> Relation(Set<MLink> linke){
        String link ="";
        for(UmlType i : Tree){
            Class[] j = i.getaClasse().getInterfaces();
            for(Class k : j){
                if(i.getaClasse().getSuperclass()==null){
                    link = k.getSimpleName()+" <|-- " + i.getaClasse().getSimpleName() + " : extends";
                }
                else{
                    link = k.getSimpleName()+" <|.. " + i.getaClasse().getSimpleName() + " : implements";
                }
                link +="\n";
                linke.add(new MLink(k,i.getaClasse(),link));
            }
        }
        return linke;
    }
    public String allRelation(Set<MLink> links, Set<UmlType> types){
        String link="";
        links = new UmlRelation(types).Relation(links);
        for (MLink i : links) {
            link += i.getLink();
        }
        return link;
    }
}
