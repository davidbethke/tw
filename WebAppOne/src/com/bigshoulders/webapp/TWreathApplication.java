package com.bigshoulders.webapp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.session.ISessionStore;

public class TWreathApplication extends WicketApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return twreath3.class;
	}
	@Override
	protected void init(){
		super.init();
		getResourceSettings().setResourcePollFrequency(null);
		getMarkupSettings().setStripWicketTags(true);
	}
	@Override
	protected ISessionStore newSessionStore(){
		return new HttpSessionStore(this);
	}
}
