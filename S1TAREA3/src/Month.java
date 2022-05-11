import java.util.*;

public class Month {

	private String name;

	public Month(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Metodos sobresecritos para no duplicar elementos en el HashSet
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}
}
