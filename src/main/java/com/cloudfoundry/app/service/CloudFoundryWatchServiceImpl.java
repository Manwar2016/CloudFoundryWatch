package com.cloudfoundry.app.service;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.cloudfoundry.client.lib.CloudFoundryClient;
import org.cloudfoundry.client.lib.CloudCredentials;
import org.cloudfoundry.client.lib.HttpProxyConfiguration;
import org.springframework.stereotype.Service;

import com.cloudfoundry.app.vo.Buildpack;


@Service
public class CloudFoundryWatchServiceImpl implements CloudFoundryWatchService {

	private CloudFoundryClient cfClient;
	private CloudCredentials cfClientCred;
	
	
	
	
	@Override
	public List<Buildpack> getBuildpacks(String foundation) {
		// TODO Auto-generated method s
		cfClientCred = new CloudCredentials("manwar.singh@capgemini.com", "Mann@123");
		System.out.println("Hello I am in get buildpakcs serive impp function");
		String target = "https://api.run.pivotal.io";
		System.out.println(cfClient);
		cfClient=getCloudFoundryClient(cfClientCred,target);			
		List<Buildpack>  buildlpacklist = new ArrayList<Buildpack>();
		Buildpack buildpack1 = new Buildpack("sdfdsf", "java buildpack", "1", "sdfdfd/sdf.git", true, "2033-23-23", "234-234-4");
		Buildpack buildpack2 = new Buildpack("sdfdsf", "java buildpack", "1", "sdfdfd/sdf.git", true, "2033-23-23", "234-234-4");
		Buildpack buildpack3 = new Buildpack("sdfdsf", "java buildpack", "1", "sdfdfd/sdf.git", true, "2033-23-23", "234-234-4");
		
		buildlpacklist.add(buildpack1);
		buildlpacklist.add(buildpack2);
		buildlpacklist.add(buildpack3);
		return buildlpacklist;
	}

	
	private  CloudFoundryClient getCloudFoundryClient(CloudCredentials cfClientCred, String target){	
		return new CloudFoundryClient(cfClientCred, getTargetURL(target));    
	}
	
	 private URL getTargetURL(String target) {
	        try {
	            return getTargetURI(target).toURL();
	        } catch (MalformedURLException e) {
	        	System.err.println("The target URL is not valid: " + e.getMessage());
	        }

	        return null;
	    }

	    private URI getTargetURI(String target) {
	        try {
	            return new URI(target);
	        } catch (URISyntaxException e) {
	     
	        	System.err.println("The target URL is not valid: " + e.getMessage());
	        }

	        return null;
	    }
	
}
 