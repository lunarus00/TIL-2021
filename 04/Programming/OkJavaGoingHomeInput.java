import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoingHomeInput {

	// parameter, �Ű�����
	public static void main(String[] args) {
		
		// String id = JOptionPane.showInputDialog("Enter a ID");
		// String bright = JOptionPane.showInputDialog("Enter a ID");
		
		// ���� �ڵ�� ���� �Է��� �޴� ���
		// �Ʒ��� �ڵ�� �Ű������� �����ϴ� ���
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+ " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+ " / FloorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+ " / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
