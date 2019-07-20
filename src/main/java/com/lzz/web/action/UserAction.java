package com.lzz.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lzz.domani.User;
import com.lzz.serice.IUserService;
import com.lzz.serice.impl.UserServiceImpl;

public class UserAction {
	private User user;
	private IUserService service=new UserServiceImpl();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String save() {
		service.save(user);
		return "find";
	}
	
	public String find(){
		List<User> list = service.find();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", list);
		return "findUI";
	}
	
	public String updateUI(){
		User u = service.find(user.getId());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("user", u);
		return "updateUI";
	}
	
	public String update() {
		service.update(user);
		return "find";
	}
	
	public String delete() {
		service.delete(user.getId());
		return "find";
	}

}
