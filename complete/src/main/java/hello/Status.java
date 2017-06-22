package hello;


public class Status {
	private final long id;
	private final String type;
	private final String state;

	public Status(long id,String type,String state){
		this.id = id;
		this.type = type;
		this.state = state;
	}

	public long getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	public String getState(){
		return state;
	}

}
