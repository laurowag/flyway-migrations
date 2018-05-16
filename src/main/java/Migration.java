import org.flywaydb.core.Flyway;

import java.util.HashMap;
import java.util.Map;

public class Migration {
	
	public static void main(String[] args) {
		//Conectar no banco de administracao
		//Retornar lista de schemas
		//Percorrer lista de schemas	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
		Flyway migration = new Flyway();
		migration.setDataSource("jdbc:sqlserver://localhost:1433;DatabaseName=arm", "sa", "lw2010@!");
		migration.setBaselineOnMigrate(true);
		Map<String, String> placeHolders = new HashMap<String, String>();		
		placeHolders.put("tenant", "time3s");
        migration.setPlaceholders(placeHolders);
		migration.setSchemas("time3s");		
		migration.migrate();
	}

}
