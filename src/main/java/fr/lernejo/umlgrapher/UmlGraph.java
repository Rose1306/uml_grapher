package fr.lernejo.umlgrapher;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class UmlGraph  {
    private final Class<?>[] classe;
    private final Set<UmlType> types = new TreeSet<>(Comparator
        .<UmlType, String>comparing(t->t.getClassName())
        .thenComparing(t->t.getPackageName()));
    private final Set<MLink> linkers = new TreeSet<>(Comparator
        .<MLink, String>comparing(t->t.getChildClass())
        .thenComparing(t->t.getParentClass()));

    public UmlGraph(Class<?>... classes) {this.classe=classes;}
    public String as (GraphType graphType){
        List<Class> tabClass = null;
        for (Class nClass : classe) {
            switch (graphType) {
                case Mermaid:
                    tabClass = new RepresentationGraph(nClass).whatIsYourRelation();
                    for (Class i : tabClass) {
                        types.add(new UmlType(i));
                    }
                    break;
            }
        }
        return new MermaidFormat(types).words() + new UmlRelation(types).allRelation(linkers, types);
    }
}
