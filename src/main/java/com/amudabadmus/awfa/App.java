package com.amudabadmus.awfa;
import com.amudabadmus.awfa.extractor.ImageExtractor;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
@Named
@RequestScoped
@ManagedBean(name="app")
public class App {

    private String userRequest, appName , roleOne, roleTwo ,index;
    private ImageExtractor imageExtractor = new ImageExtractor();
    public App() 
	{
		this("Image-Text Extractor","Image-Text","Text-Image");
    }
	public App ( String defAppName , String defRoleOne , String defRoleTwo )
	{
		appName = defAppName;
		roleOne = defRoleOne;
		roleTwo = defRoleTwo;
	}
	public String getIndex() 
	{
        return "index.xhtml";
    }
	public void setIndex( String newIndex ) 
	{
		userRequest = newIndex;
    }
	public String getAppName() 
	{
        return appName;
    }
	public String getRoleOne() 
	{
        return roleOne;
    }
	public String getRoleTwo() 
	{
        return roleTwo;
    }
	public String getUserRequest() 
	{
		return userRequest;
    }
	
    public void setUserRequest(String newReq) 
	{
		this.userRequest = newReq;
    }
}