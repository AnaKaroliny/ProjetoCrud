
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarBanco {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("projetocrud");
		factory.close();
	}

}
