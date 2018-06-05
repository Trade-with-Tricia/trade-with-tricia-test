package com.tradewithtricia;

//TODO: thin out these imports
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.twilio.*;
import com.amazonaws.*;

import java.util.List;
import java.util.Map;



public class TwilioLambda implements RequestHandler<Map<String, Object>, Response> {

    String TAC = "By replying to this message, you agree to the Terms and Conditions.";
    AmazonDynamoDB client = AmazonDynamoDBClientBuilder
            .standard()
            //.withCredentials(new AWSStaticCredentialsProvider(awsCreds))
            .withRegion(Regions.US_EAST_1)
            .build();
    DynamoDB dynamo = new DynamoDB(client);

    @Override
    public Response handleRequest(Map<String, Object> request, Context context) {

        //todo: handle errors gracefully

        //todo: the rest of it
        String SMS = (String) request.get("body-json");
        System.out.println(SMS);


        return null;
    }

}
