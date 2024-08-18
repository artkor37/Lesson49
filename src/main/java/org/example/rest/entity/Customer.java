package org.example.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity //сущность
@Table(name="customers")//связывает сущность с таблицей customers в базе данных
// класс POJO связанный с базой данных
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    private String firstname;
    private String lastname;



}
