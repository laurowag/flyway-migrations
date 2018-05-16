import org.flywaydb.core.Flyway;

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
		migration.setDataSource("jdbc:sqlserver://localhost:1433;DatabaseName=core", "sa", "lw2010@!");
		migration.setBaselineOnMigrate(true);
		migration.migrate();
	}

}
