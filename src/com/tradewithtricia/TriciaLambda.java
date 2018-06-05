package com.tradewithtricia;

//TODO: thin out these imports
import com.amazonaws.regions.Region;
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



public class TriciaLambda implements RequestHandler<Request, Response> {

    String TAC = "By replying to this message, you agree to the Terms and Conditions.";
    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    DynamoDB dynamo = new DynamoDB(client);

    @Override
    public Response handleRequest(Request request, Context context) {

        //todo: handle errors gracefully

        //todo: the rest of it


        return null;
    }

}
