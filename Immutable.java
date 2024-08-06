package tt;

public final class Immutable {
	
	private final String cllName;

	public String getCllName() {
		return cllName;
	}
	
	/// no setter methods to change the value

	public Immutable(String cllName) {
		super();
		this.cllName = cllName;
	}
	
	
}
