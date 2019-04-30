package model;

public class Comments {
	private int cid;
	private int pid;
	private int uid;
	

	private String cbody;
	public Comments() {
		
	}
	
	public Comments(int cid, int pid, int uid, String cbody) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.uid = uid;
	
		this.cbody = cbody;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public  int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getCbody() {
		return cbody;
	}
	public void setCbody(String cbody) {
		this.cbody = cbody;
	}

	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", pid=" + pid + ", uid=" + uid + ", cbody=" + cbody + "]";
	}
	
	
}
