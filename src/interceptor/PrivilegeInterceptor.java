package interceptor;

import java.util.Map;

import bean.Admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext context= invocation.getInvocationContext();//获取ActionContext对象
		Map<String, Object> session =context.getSession();//获取session
		Admin admin =(Admin)session.get("admin");//从session里获得管理员对象
		if(admin==null)return "login";
		return invocation.invoke();
	}

}
