package com.bigshoulders.webapp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.session.ISessionStore;

public class TWreathApplication extends WicketApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return TWreath.class;
	}
	protected void init(){
		getResourceSettings().setResourcePollFrequency(null);
	}
	protected ISessionStore newSessionStore(){
		return new HttpSessionStore(this);
	}
}
