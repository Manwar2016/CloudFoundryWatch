package com.cloudfoundry.app.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudfoundry.app.service.CloudFoundryWatchService;
import com.cloudfoundry.app.vo.Buildpack;

@RestController
public class BuildpackController {

@Autowired
private CloudFoundryWatchService cloudFoundryWatchService ;
@RequestMapping(value="/buildpacks/{foundation}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
public List<Buildpack> getBuildpacks(@PathVariable String foundation){
	System.out.println("Hlleo");
	return cloudFoundryWatchService.getBuildpacks(foundation);
}
}
