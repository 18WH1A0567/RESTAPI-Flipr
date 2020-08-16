package com.ts;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.openExcel;
import com.dao.userDAO;
import com.dto.User;


@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @Path("registerUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int registerUser(User user){
    	System.out.println(user);
    	userDAO userDAO = new userDAO();
    	return userDAO.register(user);
		    	
    }
    
    @Path("getUserById/{userEmail}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)    
    public User getUserById(@PathParam("userEmail") String userEmail){
    	System.out.println("In get user");
    	User user = new User();
    	userDAO userDAO = new userDAO();
    	user = userDAO.getUserById(userEmail);
    	return user;
    	
    }
    
    @Path("getTATA")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getTATA() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openTATA();
    }
    
    @Path("getReliance")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getReliance() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openReliance();
    }
    
    @Path("getEichermot")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getEichermot() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openEichermot();
    }
    
    
    @Path("getCipla")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getCipla() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openCipla();
    }
    
    @Path("getAshokLeyland")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getAshokLeyland() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openAshokLeyland();
    }
    
    @Path("openNSE")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> openNSE() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openNSE();
    }
    
    @Path("openBSE")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> openBSE() throws Exception{
    	openExcel openExcel = new openExcel();
    	return openExcel.openNSE();
    }

}
