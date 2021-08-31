import grafo.GrafoDoBrasilMontar;
import grafo.No;
import grafo.Vertices;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GrafoDoBrasilMontar grafo = new GrafoDoBrasilMontar();

        List retorno = grafo.buildGraph();

//        No aux = (No) retorno.get(0);
//        Vertices teste = (Vertices)aux.getVertices().get(0);
//        System.out.println(teste.getNo().getID());

        //pegar estado com maior quantidade de vizinhos
        No maisVertices = null;
        int qtdVertices=0;

        for (int i = 0; i < retorno.size(); i++) {
            No aux = (No) retorno.get(i);

            if(qtdVertices< aux.getVertices().size()){
                qtdVertices = aux.getVertices().size();
                maisVertices = (No) retorno.get(i);
            }
        }

        System.out.println("estado com mais vizinhos: "+maisVertices.getID());




        //pegar estado com menor quantidade de vizinhos(pega o primeiro)
        No menosVertices = null;
        //qtdVertices não se altera pois ja esta com o maior valor da lista

        for (int i = 0; i < retorno.size(); i++) {
            No aux = (No) retorno.get(i);

            if(qtdVertices> aux.getVertices().size()){
                qtdVertices = aux.getVertices().size();
                menosVertices = (No) retorno.get(i);
            }
        }

        System.out.println("estado com mais vizinhos: "+menosVertices.getID());


        //listar osestados vizinhos do estado com mais fronteiras
        System.out.print("estados vizinhos do estado :"+maisVertices.getID()+" vizinhos");
        for (int i = 0; i < maisVertices.getVertices().size(); i++) {
            Vertices aux = (Vertices) maisVertices.getVertices().get(i);
            System.out.print(", "+aux.getNo().getID());
        }
        System.out.println();

        //listar osestados vizinhos do estado com menos fronteiras
        System.out.print("estados vizinhos do estado :"+menosVertices.getID()+" vizinhos");
        for (int i = 0; i < menosVertices.getVertices().size(); i++) {
            Vertices aux = (Vertices) menosVertices.getVertices().get(i);
            System.out.print(", "+aux.getNo().getID());
        }
        System.out.println();




        int qtdTotalDeVertices = retorno.size();
        int qtdTotalDeArestas=0;

        for (int i = 0; i < retorno.size(); i++) {
            No aux = (No) retorno.get(i);
            qtdTotalDeArestas += aux.getVertices().size();
        }

        qtdTotalDeArestas = (qtdTotalDeArestas/2);
        System.out.println(qtdTotalDeArestas);
        System.out.println(qtdTotalDeVertices);
        float densidade = ((float) qtdTotalDeArestas/(float) qtdTotalDeVertices);
        System.out.println("densidade do grafo e igual a :"+ densidade);






        for (int i = 0; i < retorno.size(); i++) {
            No aux = (No) retorno.get(i);
            System.out.println("vertice numero :"+(i+1)+" sigla do estado :"+aux.getID()+" pussui :"+ aux.getVertices().size()+" arestas");

        }



    }
}
