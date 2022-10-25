package fr.lernejo.umlgrapher;
public class UmlGraph  {
    private final Class<?>[] classe;
    public UmlGraph(Class<?>... classes) {this.classe=classes;}
    public  String as(GraphType type) {
        String st= "classDiagram\n";
        for(Class myClass : classe) {
            if(type==GraphType.Mermaid) {
                st = st + "class " + myClass.getSimpleName();
                if (myClass.isInterface()) {
                    st = st + " {\n" + "    <<interface>>\n" + "}\n";
                }
                else {
                    st = st + " {\n" + "    <<class>>\n" + "}\n";
                }
            }
        }

        return st;
    }
}
