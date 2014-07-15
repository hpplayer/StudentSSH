package action;

import service.AdminService;
import bean.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Admin admin;
	private AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (adminService.login(admin)) {
				ActionContext.getContext().getSession().put("admin", admin);
				return SUCCESS;
			} else {
				return INPUT;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (null == admin.getName() || "".equals(admin.getName())) {
			addFieldError("admin.name", "«Î ‰»Îµ«¬º√˚");
		}
		if (null == admin.getPassword() || "".equals(admin.getPassword())) {
			addFieldError("admin.password", "«Î ‰»Î√‹¬Î");
		}
	}

}
