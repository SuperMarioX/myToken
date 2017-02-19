package com.myhk.console.access.resource;


import com.myhk.console.access.util.TokenResourceUtil;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * Created by Victor on 19/02/2017.
 */

@Controller
public class TokenResource extends ServerResource{

    /**
     * Log instance
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TokenResource.class);

    /**
     * Do the init things which will affect all the methods
     */
    @Override
    protected void doInit() throws ResourceException {
        LOGGER.debug("Enter the token init resource.");
    }


    @Post
    public Object generateToken(String payload) throws ResourceException{
        LOGGER.info("Start to generate a token.");
        LOGGER.debug("Check the param validation");

        // 1. Check the ak/sk is valid in server or db
        if (TokenResourceUtil.CheckDefaultCredentialValid(payload)) {

        } else {
            System.out.print("wrong");
        }


       // System.out.println("post");
        return new Object();
    }
}
