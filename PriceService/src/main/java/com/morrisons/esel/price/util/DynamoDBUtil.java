package com.morrisons.esel.price.util;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class DynamoDBUtil {
	private static final DynamoDBMapper mapper;
	static {
		try {
			AmazonDynamoDBClient client = new AmazonDynamoDBClient(new ProfileCredentialsProvider())
					.withEndpoint("http://localhost:8000");

			mapper = new DynamoDBMapper(client);

		} catch (Throwable ex) {
			// Log the exception.
			System.err.println("Initial client creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static DynamoDBMapper getMapper() {
		return mapper;
	}
}