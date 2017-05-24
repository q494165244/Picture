package tools;

public class VerificationCode {
	public static String GenerateVerificationCode(){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<6;i++)
			sb.append((int)(Math.random()*10));
		return sb.toString();
	}
}
