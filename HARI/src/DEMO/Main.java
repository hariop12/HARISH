package DEMO;
class scl{
	int id;
	String name;
	public scl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "scl [id=" + id + ", name=" + name + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		scl s = new scl(1,"aliza");
		System.out.println(s);
	}

}
