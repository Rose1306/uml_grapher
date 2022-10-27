package fr.lernejo.umlgrapher;

import java.util.ArrayList;
import java.util.List;
public class RepresentationGraph {
    private final Class classe;
    public RepresentationGraph(Class classe) {this.classe = classe;}
    public List<Class> recursiveRelation(List<Class> recursiveList, Class... table){
        for(Class nC : table){
            if(!recursiveList.contains(nC)){
                recursiveList.add(nC);
                recursiveList = recursiveRelation(recursiveList, nC.getInterfaces());
            }
        }
        return recursiveList;
    }
    public List<Class> whatIsYourRelation(){
        List<Class> tList = new ArrayList<>();
        tList = recursiveRelation(tList, this.classe);
        return tList;
    }

}
