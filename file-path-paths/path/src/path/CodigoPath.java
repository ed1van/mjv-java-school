package path;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CodigoPath {

	public static void main(String[] args) throws IOException {
		
		boolean sim = true;
		
		Path pastaPath = Paths.get("+");  //nome da pasta
		if(Files.notExists(pastaPath) && sim == true) {	
			//criar pasta
		Path pastaDir = Files.createDirectory(pastaPath);
		}
		
		
		
		Path subPastaPath = Paths.get("+/subpasta/subsubpasta"); //nome das sub pastas depois da / 
		//criar pastas e sub pastas
		Path pastaDir = Files.createDirectories(subPastaPath);
		
		
		//para criar o arquivo txt
		Path filePath = Paths.get(subPastaPath.toString(), "salmao.txt");  
		if(Files.notExists(filePath)) {
		Path arquivoPath = Files.createFile(filePath);
		
		//alterar nome do txt
		Path origem = filePath;
		Path destino = Paths.get(filePath.getParent().toString(), "new are.txt");
		Files.copy(origem, destino );
		}
		
		
	}

}
