package java19;

public class Gay {
	String title;
	String content;
	String owner;
	String pw;
	public Gay(String title, String content, String owner, String pw) {
		super();
		this.title = title;
		this.content = content;
		this.owner = owner;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Gay [title=" + title + ", content=" + content + ", owner=" + owner + ", pw=" + pw + "]";
	}
	
	

}
