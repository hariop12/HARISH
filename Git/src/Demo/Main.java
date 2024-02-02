package Demo;
class School{
	int id;
	String name;
	int fee;
	String add;
	public School(int id, String name, int fee, String add) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.add = add;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", fee=" + fee + ", add=" + add + "]";
	}
}
public class Main {
	public static void main(String[] args) {
		School scl = new School(1, "harish", 5467, "dahisar");
		System.out.println(scl);
		
	}
	

}
