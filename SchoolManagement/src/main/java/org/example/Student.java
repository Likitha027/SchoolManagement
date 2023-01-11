package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Student
{
    String FirstName;
    String LastName;
    String Gender;

    Integer StudentId;
    String Department;
}
