package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {
    private static Logger LOG = LoggerFactory.getLogger("TwitterToKafkaServiceApplication.class");

    private  final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData configData) {
        this.twitterToKafkaServiceConfigData = configData;

    }
    public static void main(String[] args) {
        LOG.info("SpringApplication before starts...");
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
        LOG.info("SpringApplication after starts...");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App starts...");
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
    }
}














