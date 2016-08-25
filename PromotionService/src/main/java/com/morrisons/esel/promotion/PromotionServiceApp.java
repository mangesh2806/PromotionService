package com.morrisons.esel.promotion;



import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.morrisons.esel.promotion.config.PromotionServiceConfiguration;
import com.morrisons.esel.promotion.dao.PromotionDao;
import com.morrisons.esel.promotion.dao.PromotionDaoImpl;
import com.morrisons.esel.promotion.healthcheck.PromotionHealthCheck;
import com.morrisons.esel.promotion.resources.PromotionService;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;


public class PromotionServiceApp extends Application<PromotionServiceConfiguration> 
{
	public static void main(String[] args) throws Exception {
		new PromotionServiceApp().run(args);
	}
	
	
	
	 private Injector createInjector(final PromotionServiceConfiguration conf) {
	        return Guice.createInjector(new AbstractModule() {
	            @Override
	            protected void configure() {
	               
	                // for PromotionDao
	                bind(PromotionDao.class).to(PromotionDaoImpl.class);
	            }
	        });
	    }
	
	
	@Override
	@SuppressWarnings("all")
    public void initialize(Bootstrap<PromotionServiceConfiguration> bootstrap) {
    	bootstrap.addBundle(new SwaggerBundle<PromotionServiceConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(PromotionServiceConfiguration configuration)
            {
            	
                return configuration.swaggerBundleConfiguration;
            }
            });
    	
    
	    	
	 }
	@Override
	public void run(PromotionServiceConfiguration arg0, Environment env) throws Exception {
		Injector injector = createInjector(arg0);
		env.healthChecks().register("priceHealthCheck", new PromotionHealthCheck());
		env.jersey().register(injector.getInstance(PromotionService.class));
		
		
	}
	
	
}