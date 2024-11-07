import java.util.*;
public class Main {

    public static void main(String[] args) {

        EstudanteGraduacao a = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudanteMestrado b = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado c = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(a);
        estudantes.add(b);
        estudantes.add(c);
        estudantes.remove(c);

        for(Estudante el: estudantes)
            el.print();

        System.out.println("================================================");

        HashMap<Integer,Estudante> hashEstudante = new HashMap<Integer,Estudante>();
        hashEstudante.put(1,a);
        hashEstudante.put(2,b);
        hashEstudante.put(3,c);

        Estudante d = hashEstudante.get(1);
        d.print();


    }
}
