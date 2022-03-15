package com.test;
import com.example.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/example")
public class TestController {
  private String topicName="example.person";
   @Autowired
   KafkaTemplate<String,Person> kafkaTemplate;
  @PostMapping("/send")
  public ResponseEntity sendMsg(@RequestBody PersonDto personDto){
    try {
      Person person = getPerson( personDto );
      kafkaTemplate.send( topicName, UUID.randomUUID().toString(), person );
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      return new ResponseEntity(  "Send new record to message broker."  ,HttpStatus.OK);
    }
  }
  
  private Person getPerson(PersonDto personDto) {
    return Person
    .newBuilder()
    .setAddress( personDto.getAddress() )
    .setAge( personDto.getAge() )
    .setFamily( personDto.getFamily() )
    .setName( personDto.getName() )
    .setId( UUID.randomUUID().toString())
    .setSalary( personDto.getSalary() ).build();
  }
}
