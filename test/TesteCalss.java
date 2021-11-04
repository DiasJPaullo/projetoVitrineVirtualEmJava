
import classesJava.ReadJson;
import dados.Mock;
import java.io.File;
import java.io.IOException;

// @author diasj
 
public class TesteCalss  {
    public static void main(String[] args) {
        Mock test = new Mock();
        ReadJson c = new ReadJson();
        //System.out.println(c.caminho());
        
        System.out.println(test.getListaId());
        File arquivo1 = new File("\\dados\\dados.xml");
        System.out.println(arquivo1.getAbsolutePath());
       // C:\Users\diasj\Documents\NetBeansProjects\TrabalhoVitrineVirtual\src\java\dados\dados
    }
}
