package ch02;

public class EqaualTest1 {
	public static void main(String[] args) {
		Student1 std1 = new Student1(100,"Lee");
		Student1 std2 = new Student1(100,"Lee");
		
		
		System.out.println(std1 == std2); //다른 객체여서 false 이 뜬다
		System.out.println(std1.equals(std2)); //문자열이 같은지 확인했을때 주소값이 같은지 확인
		// 해쉬 코드 출력하기
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	
	}

}
