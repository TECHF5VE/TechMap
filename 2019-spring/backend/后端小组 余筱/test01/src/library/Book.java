package library;

public class Book {
	private String name;
	private String id;
	private boolean flag;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	//¹¹ÔìÆ÷
	public Book(String name,String id) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		flag=true;
	}
	
	
	

}
