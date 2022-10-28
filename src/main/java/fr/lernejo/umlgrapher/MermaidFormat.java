package fr.lernejo.umlgrapher;

import java.lang.reflect.Modifier;
import java.util.Set;
public class MermaidFormat {
    private final Set<UmlType> Types;
    public MermaidFormat(Set<UmlType> types) { this.Types = types; }
    public String words(){
        String cord = "classDiagram\n";
        for(UmlType typ: Types){
            cord +="class " + typ.getClassName();
            if(Modifier.isInterface(typ.getaClasse().getModifiers())){
                cord += " {\n    <<interface>>\n}";
            }
            cord += "\n";
        }
        return cord;
    }
}
