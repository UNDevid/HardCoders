
public class Endpoint {

	private int id;
	private int ld;
	private int K;
	
	public Endpoint(int id, int ld, int k) {
		super();
		this.id = id;
		this.ld = ld;
		K = k;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLd() {
		return ld;
	}
	public void setLd(int ld) {
		this.ld = ld;
	}
	public int getK() {
		return K;
	}
	public void setK(int k) {
		K = k;
	}
	
	@Override
	public String toString() {
		return "Endpoint [id=" + id + ", ld=" + ld + ", K=" + K + "]";
	}
	
}
