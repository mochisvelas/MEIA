/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1meia;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Brenner
 */
public class FileUtils {
    
    public void CreateFile(String filename, String path) throws IOException
    {
        File file=new File(filename+".txt");
        
        if (file.exists()) {
            file.createNewFile();
        }
    }
}
