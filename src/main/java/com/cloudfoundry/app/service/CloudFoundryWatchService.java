package com.cloudfoundry.app.service;

import java.util.List;

import com.cloudfoundry.app.vo.Buildpack;

public interface CloudFoundryWatchService {

	
public List<Buildpack> getBuildpacks(String foundation);
}