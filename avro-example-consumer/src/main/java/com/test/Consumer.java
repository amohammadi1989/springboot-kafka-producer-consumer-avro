package com.test;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.example.*;
/**
 * Created By: Ali Mohammadi
 * Date: 15 Mar, 2022
 */
@Service
public class Consumer {
  
  @KafkaListener(topics = "example.person",groupId = "person")
  public void consum(ConsumerRecord<String,Person> person){
    System.out.println("schema id is:"+person.key()+"==>value is:"+person.value());
  }
}
