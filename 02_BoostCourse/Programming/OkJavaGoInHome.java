import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHome {
	public static void main(String[] args) {
		
		String id = "HD APT 801";
		//���������� �� 
		//Elevator(String id): ����
		//callForUp(int stopFloor): �޼ҵ�
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//��ť��Ƽ ����
		//Security(String id)
		//boolean off()
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//���� ��
		//Lighting(String id)
		Lighting hallLamp = new Lighting( id+"/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting( id+"/ Floor Lamp");
		floorLamp.on();
	}
}
