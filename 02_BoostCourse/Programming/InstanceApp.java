import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
	public static void main(String[] args) throws FileNotFoundException {
		//파일의 예외상황도 설정
		//인스턴스를 생성하면 클래스와 달리 여러작업을 할 경우, 지정된 상태를 가지므로 효율적
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p1.write("Hello 2");
		p1.close();
	}
}
