import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Aplicacao {

    
	/**
	 * @return
	 * @throws IOException
	 */
	public static void lerArquivoCurso() throws IOException {
		try {
			Curso curso = new Curso();
			BufferedReader buffRead = new BufferedReader(new FileReader("cursos.txt"));
			String linha = buffRead.readLine();
			
			while(linha != null) {
				String[] partes = linha.split(";");
				if(partes.length > 0) {
					String nomeCurso = partes[0];
					System.out.println("Curso - " + nomeCurso);
					String materias[] = Arrays.copyOfRange(partes, 1, partes.length);
					for(String materia : materias) {
						System.out.println(" Materia " + materia);
					}
					
				}
				
				
				linha = buffRead.readLine();
			}
			buffRead.close();
			
//			return cursos;
		}catch(IOException ex){
			ex.printStackTrace();
//			return null;
		}
	}
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		lerArquivoCurso();
	}
}
