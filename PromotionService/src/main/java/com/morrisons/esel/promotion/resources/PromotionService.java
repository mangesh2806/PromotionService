package com.morrisons.esel.promotion.resources;

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
import com.morrisons.esel.promotion.dao.PromotionDao;
import com.morrisons.esel.promotion.dao.PromotionDaoImpl;
import com.morrisons.esel.promotion.model.Promotion;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/ESEL")
@Api(value="Promotion", description="The Promotion Service provides the promotion of the product per store")

public class PromotionService {
	
	
	
		private final Logger logger = LoggerFactory.getLogger(PromotionService.class);
		
		
		private PromotionDao promotionDao;
		
		
		@Inject
		public void setPriceDao(PromotionDao promotionDao) {
			this.promotionDao = promotionDao;
		}
		
		

		@GET	
		@Timed
		@Produces(MediaType.APPLICATION_JSON)
		@ApiOperation(value="Get All Promotion List", response = Promotion.class) 
		@Path("/promotion/fetchAll")
		@ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid specification"), @ApiResponse(code = 404, message = "Promotion not found")})
		public Response fetchAll() {
		
			
			List<Promotion> promotionlist=new ArrayList<Promotion>();
			promotionlist=promotionDao.fetchAll();
			return Response.ok().entity(promotionlist).build();
		}	
		
		@GET	
		@Timed
		@Produces(MediaType.APPLICATION_JSON)
		@ApiOperation(value="gets the promotions based upon the storeId and productId", response = Promotion.class) 
		@Path("/promotion/stores/{storeid}/products/{productid}")
		@ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid specification"), @ApiResponse(code = 404, message = "Promotion not found")})
		public Response fetchByStoreAndProductId(@PathParam ("storeid") String storeId,@PathParam ("productid") String productId) {
		
			
			List<Promotion> promotionList=new ArrayList<Promotion>();
			promotionList=promotionDao.fetchByStoreAndProductId(storeId,productId);			
			return Response.ok().entity(promotionList).build();
		}
	}



