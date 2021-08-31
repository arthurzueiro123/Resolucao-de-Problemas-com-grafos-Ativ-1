package grafo;

import java.util.ArrayList;
import java.util.List;

public class No {
    protected final String ID;
    //protected double value = Double.MAX_VALUE;
    protected final List<Vertices> vertices = new ArrayList<Vertices>();

    public No(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    //public double getValue() { return value; }

    public List getVertices(){
        return vertices;
    }

    public void addVertice(No n){
        vertices.add(new Vertices(n));
        n.vertices.add(new Vertices(this));
    }


}