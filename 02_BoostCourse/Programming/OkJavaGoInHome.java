import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHome {
	public static void main(String[] args) {
		
		String id = "HD APT 801";
		//엘리베이터 콜 
		//Elevator(String id): 지정
		//callForUp(int stopFloor): 메소드
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//시큐리티 종료
		//Security(String id)
		//boolean off()
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//조명 켬
		//Lighting(String id)
		Lighting hallLamp = new Lighting( id+"/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting( id+"/ Floor Lamp");
		floorLamp.on();
	}
}
