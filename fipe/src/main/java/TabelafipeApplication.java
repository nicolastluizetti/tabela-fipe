import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import Principal.Principal;

public class TabelafipeApplication implements CommandLineRunner {
	

		public static void main(String[] args) {
			SpringApplication.run(TabelafipeApplication.class, args);
		}

		public void run(String... args) throws Exception {
			Principal principal = new Principal();
			principal.exibeMenu();
		}

}
