package base.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response{
	
	private String rspCode;
	
	private String rspInfo;
	
	private Object data;
	
	
	public Response(Object data){
		this.rspCode = "00000";
		this.rspInfo = "成功";
		this.data = data;
	}
	
	public Response(String rspCode,String rspInfo){
		this.rspCode = rspCode;
		this.rspInfo = rspInfo;
	}
}
