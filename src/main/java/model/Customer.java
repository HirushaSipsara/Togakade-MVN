package model;

import lombok.*;

@Data //Getter and Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer {
    private String id;
    private String Name;
    private String Address;
    private Double Salary;
}
