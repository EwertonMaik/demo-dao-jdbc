package db;

public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	// Metódo Construtor
	public DbIntegrityException(String msg) {
		super(msg);
	}
	
}
