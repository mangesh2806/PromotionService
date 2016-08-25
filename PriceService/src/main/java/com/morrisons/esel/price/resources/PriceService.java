package com.morrisons.esel.price.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;
import com.morrisons.esel.price.dao.PriceDao;
import com.morrisons.esel.price.model.Price;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/ESEL")
@Api(value="Price", description="Price")
public class PriceService {
	
	
	
		private final Logger logger = LoggerFactory.getLogger(PriceService.class);
		
		
		private PriceDao priceDao;
		
		/*@Inject
		private PriceDaoImpl pricedaoimpl;*/
		@Inject
		public void setPriceDao(PriceDao priceDao) {
			this.priceDao = priceDao;
		}
		
		

		@GET	
		@Timed
		@Produces(MediaType.APPLICATION_JSON)
		@ApiOperation(value="Get All PriceList", response = Price.class) 
		@Path("/price/fetchAll")
		@ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid specification"), @ApiResponse(code = 404, message = "Price not found")})
		public Response fetchAll() {
		
			logger.info("In A:"+logger.getClass()+":");
			List<Price> pricelist=new ArrayList<Price>();
			pricelist=priceDao.fetchAll();
			//pricelist=pricedaoimpl.fetchAll();
			return Response.ok().entity(pricelist).build();
		}
		
		@GET	
		@Timed
		@Produces(MediaType.APPLICATION_JSON)
		@ApiOperation(value="Get All PriceList", response = Price.class) 
		@Path("/price/stores/{storeid}/products/{productid}")
		@ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid specification"), @ApiResponse(code = 404, message = "Price not found")})
		public Response fetchByStoreAndProductId(@PathParam ("storeid") String storeId,@PathParam ("productid") String productId) {
		
			logger.info("In A:"+logger.getClass()+":");
			List<Price> pricelist=new ArrayList<Price>();
			pricelist=priceDao.fetchByStoreAndProductId(storeId,productId);			
			return Response.ok().entity(pricelist).build();
		}
	}



