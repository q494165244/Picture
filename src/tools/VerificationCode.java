package tools;
import com.taobao.api.TaobaoClient;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class VerificationCode {
	public static String GenerateVerificationCode(){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<6;i++)
			sb.append((int)(Math.random()*10));
		return sb.toString();
	}
	public static int SendSMS(String code) {

		TaobaoClient client = new DefaultTaobaoClient(url, "23866323", "8c880c80e1915f27b75f61f1a1011054");
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("");
		req.setSmsType("normal");
		req.setSmsFreeSignName("");
		req.setSmsParamString("");
		req.setRecNum("13000000000");
		req.setSmsTemplateCode("SMS_68430001");
		AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());

	}//Need to Configure

	public static void main(String[] args) {
		int status = SendSMS(GenerateVerificationCode());
		if (status == 1)
			System.out.println("Success");
		else
			System.out.println("Fail");
	}
}
