package classesJava;

// @author diasj

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class ReadJson {

    public Produtos retornaListaProduto(){
            URL url = getClass().getResource("/dados/dados.json");
            File file = new File(url.getPath());
            System.out.println(file);
            
            //String filename= "C:\\Users\\diasj\\Documents\\NetBeansProjects\\TrabalhoVitrineVirtual\\src\\java\\dados\\dados.json";
            Path pathToFile = Paths.get(file.toString());

            String json;
        try {
            json = String.join(" ",
                    Files.readAllLines(
                            pathToFile,
                            StandardCharsets.UTF_8)
            
            );
            Produtos prod = new Gson().fromJson(json, Produtos.class);  
            
            return prod;
        } catch (IOException ex) {
            Logger.getLogger(ReadJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
       
       
    }
    
}




