package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Desktop();
		computer.turnOn();
		computer.display();
		computer.typing();
		
		computer.turnOff();
	}

}
 