package ch08;

public class AutoColseableObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}

	

}
