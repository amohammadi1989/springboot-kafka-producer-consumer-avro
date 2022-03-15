package com.test;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
/**
 * Created By: Ali Mohammadi
 * Date: 10 Mar, 2022
 */
public class producer {
  public static void main(String[] args) throws Exception{
    //Instantiating generated emp class
/*    empS e1=new empS();
  
    //Creating values according the schema
    e1.setName("ali");
    e1.setFamily( "karimi" );
    e1.setAge(21);
    e1.setSalary(30000);
    e1.setAddress("mohammadi");
    e1.setId(001);
    
  
    //Instantiate DatumWriter class
    DatumWriter<empS> empDatumWriter = new SpecificDatumWriter<>( empS.class);
    DataFileWriter<empS> empFileWriter = new DataFileWriter<empS>( empDatumWriter);
  
    empFileWriter.create(e1.getSchema(), new File( "D:/emp.avro"));
  
    empFileWriter.append(e1);
  
    empFileWriter.close();
  
    System.out.println("data successfully serialized");*/
  }
}
