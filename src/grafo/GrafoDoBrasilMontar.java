package grafo;

import java.util.ArrayList;
import java.util.List;

public class GrafoDoBrasilMontar {

    public static List<No> buildGraph() {
        No ac = new No("AC");
        No al = new No("AL");
        No ap = new No("AP");
        No am = new No("AM");
        No ba = new No("BA");
        No ce = new No("CE");
        No es = new No("ES");
        No go = new No("GO");
        No ma = new No("MA");
        No mt = new No("MT");
        No ms = new No("MS");
        No mg = new No("MG");
        No pa = new No("PA");
        No pb = new No("PB");
        No pr = new No("PR");
        No pe = new No("PE");
        No pi = new No("PI");
        No rj = new No("RJ");
        No rn = new No("RN");
        No rs = new No("RS");
        No ro = new No("RO");
        No rr = new No("RR");
        No sc = new No("SC");
        No sp = new No("SP");
        No se = new No("SE");
        No to = new No("TO");

        No df = new No("DF");

        //acre
        ac.addVertice(am);
        ac.addVertice(ro);

        //alagoas
        al.addVertice(pe);
        al.addVertice(se);
        al.addVertice(ba);

        //amapa
        ap.addVertice(pa);

        //amazonas
        //am para ac ja foi adicionado em cima
        am.addVertice(ro);
        am.addVertice(rr);
        am.addVertice(mt);
        am.addVertice(pa);

        //bahia
        //ba para al ja foi adicionada
        ba.addVertice(se);
        ba.addVertice(pe);//pernanbuco
        ba.addVertice(pi);//Piauí
        ba.addVertice(to);//Tocantins
        ba.addVertice(go);// Goiás
        ba.addVertice(mg);// Minas Gerais
        ba.addVertice(es);// Espírito Santo.

        //ceara
        ce.addVertice(pe);//Pernambuco
        ce.addVertice(rn);//Rio Grande do Norte
        ce.addVertice(pb);//Paraíba
        ce.addVertice(pi);//Estado do Piauí.

        //espirito santo
        //es e ba ja foi adicionado //Bahia
        es.addVertice(mg);//Minas Gerais
        es.addVertice(rj);//Rio de Janeiro

        //goias
        //a ligação go ba ja foi adicionada Bahia
        go.addVertice(to);//Tocantins
        go.addVertice(mg);// Minas Gerais
        go.addVertice(mt);// Mato Grosso
        go.addVertice(ms);// Mato Grosso do Sul


        //maranhão
        ma.addVertice(pi);//Pauí
        ma.addVertice(to);//Tocantins
        ma.addVertice(pa);//Pará

        //mato grosso
        //mato grosso e go ja foi representado
        //mt e am ja foi representado
        mt.addVertice(ms);
        mt.addVertice(ro);
        mt.addVertice(to);
        mt.addVertice(pa);

        //mato grosso do sul

        //ms e mt ja foi repressentado
        //ms e go ja foi repressentado
        ms.addVertice(sp);
        ms.addVertice(pr);
        ms.addVertice(mg);

        //minas gerais
        //mg e ba ja foi repressentado
        //mg e es ja foi repressentado
        //mg e go ja foi repressentado
        //mg e ms ja foi repressentado
        mg.addVertice(rj);
        mg.addVertice(sp);

        //para
        //pa e am ja foi repressentado
        //pa e ap ja foi repressentado
        //pa e ma ja foi repressentado
        //pa e mt ja foi repressentado
        pa.addVertice(to);
        pa.addVertice(rr);


        //paraiba
        //pb e ce ja foi repressentado
        pb.addVertice(rn);
        pb.addVertice(pe);

        //parana
        //pr e ms ja foi repressentado
        pr.addVertice(sp);
        pr.addVertice(sc);

        //pernanbuco
        //pe e ce ja foi repressentado
        //pe e pb ja foi repressentado
        //pe e al ja foi repressentado
        //pe e ba ja foi repressentado
        pe.addVertice(pi);

        //piaui
        //pi e ma ja foi repressentado
        //pi e ce ja foi repressentado
        //pi e pe ja foi repressentado
        pi.addVertice(to);

        //rio de janeiro
        //rj e es ja foi repressentado
        //rj e mg ja foi repressentado
        rj.addVertice(sp);

        //rio grande do norte
        //rn e ce ja foi repressentado
        //rn e pb ja foi repressentado

        //rio grande do sul
        rs.addVertice(sc);

        //rondonia
        //ro e am ja foi repressentado
        //ro e mt ja foi repressentado
        //ro e am ja foi repressentado
        //ro e ac ja foi repressentado

        //roraima
        //rr e am ja foi repressentado
        //rr e pa ja foi repressentado

        //santa catarina
        //sc e rs ja foi repressentado
        //sc e pr ja foi repressentado

        //são paulo
        //sp e ms ja foi repressentado
        //sp e rj ja foi repressentado
        //sp e mg ja foi repressentado
        //sp e pr ja foi repressentado

        //sergipe
        //se e al ja foi repressentado
        //se e ba ja foi repressentado

        //tocatins
        //ja foi adicionado


        //distriro federal
        df.addVertice(go);
        df.addVertice(mg);



        List<No>estados =new ArrayList<No>();
        estados.add(ac);
        estados.add(al);
        estados.add(ap);
        estados.add(am);
        estados.add(ba);
        estados.add(ce);
        estados.add(es);
        estados.add(go);
        estados.add(ma);
        estados.add(mt);
        estados.add(ms);
        estados.add(mg);
        estados.add(pa);
        estados.add(pb);
        estados.add(pr);
        estados.add(pe);
        estados.add(pi);
        estados.add(rj);
        estados.add(rn);
        estados.add(rs);
        estados.add(ro);
        estados.add(rr);
        estados.add(sc);
        estados.add(sp);
        estados.add(se);
        estados.add(to);

        estados.add(df);

        return estados;
    }



}
