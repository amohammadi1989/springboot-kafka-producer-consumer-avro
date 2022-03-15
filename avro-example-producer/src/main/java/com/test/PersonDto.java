package com.test;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Created By: Ali Mohammadi
 * Date: 15 Mar, 2022
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
  private String name;
  private String family;
  private String address;
  private int salary;
  private int age;
}
