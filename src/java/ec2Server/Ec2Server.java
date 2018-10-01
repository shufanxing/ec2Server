/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec2Server;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author macbook
 */
@Path("ec2Server")
public class Ec2Server {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Ec2Server
     */
    public Ec2Server() {
    }

    /**
     * Retrieves representation of an instance of ec2Server.Ec2Server
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getStatus() {
         return "alive";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of Ec2Server
     * @param content representation for the resource
     * @return 
     */
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int postText(String content) {
       return content.length();
    }
    
}
