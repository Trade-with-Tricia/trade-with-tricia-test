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
import com.twilio.twiml.Message;
import com.twilio.twiml.TwiML;
import com.twilio.twiml.TwiMLException;

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

    String TWILIO_SMS_URL = "https://api.twilio.com/2010-04-01/Accounts/{}/Messages.json";
    String TWILIO_AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    String TWILIO_ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");


    @Override
    public Response handleRequest(Map<String, Object> request, Context context) {

        //todo: handle errors gracefully (try catch)

        //todo: the rest of it
        String SMS = (String) request.get("body-json"); //text body from twilio


        // PARSE INPUT

        //first five characters are "From="
        String number = SMS.substring(5, 15);
        String body = SMS.substring(21);
        body = body.replace('+', ' ');



        Twilio.init(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN);
        TWILIO_SMS_URL.format(TWILIO_ACCOUNT_SID);



        return null;
    }

}
