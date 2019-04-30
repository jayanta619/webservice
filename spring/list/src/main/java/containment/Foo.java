package containment;

public class Foo {

	String msg;

	public Foo() {
		System.out.println(".");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Foo [msg=" + msg + "]";
	}
	
	
}
