package com.morrisons.esel.price;



import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.morrisons.esel.price.config.PriceServiceConfiguration;
import com.morrisons.esel.price.dao.PriceDao;
import com.morrisons.esel.price.dao.PriceDaoImpl;
import com.morrisons.esel.price.healthcheck.PriceHealthCheck;
import com.morrisons.esel.price.resources.PriceService;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;


public class PriceServiceApp extends Application<PriceServiceConfiguration> 
{
	public static void main(String[] args) throws Exception {
		new PriceServiceApp().run(args);
	}
	
	
	
	 private Injector createInjector(final PriceServiceConfiguration conf) {
	        return Guice.createInjector(new AbstractModule() {
	            @Override
	            protected void configure() {
	               
	                // for PersonDAO
	                bind(PriceDao.class).to(PriceDaoImpl.class);
	            }
	        });
	    }
	
	
	@Override
	@SuppressWarnings("all")
    public void initialize(Bootstrap<PriceServiceConfiguration> bootstrap) {
    	bootstrap.addBundle(new SwaggerBundle<PriceServiceConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(PriceServiceConfiguration configuration)
            {
            	
                return configuration.swaggerBundleConfiguration;
            }
            });
    	
    
	    	
	 }
	@Override
	public void run(PriceServiceConfiguration arg0, Environment env) throws Exception {
		Injector injector = createInjector(arg0);
		env.healthChecks().register("priceHealthCheck", new PriceHealthCheck());
		env.jersey().register(injector.getInstance(PriceService.class));
		
		
	}
	
	
}