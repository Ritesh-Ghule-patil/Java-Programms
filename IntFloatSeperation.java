package ritesh;
import java.util.Scanner;
public class IntFloatSeperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the floating point number");
		float f = sc.nextFloat();
		
		int num = (int)f;
		int floatValue = (int)((f-num)*100);
		
		System.out.println("Integer: "+num +","+ "Float: "+floatValue);
		
	}
}
