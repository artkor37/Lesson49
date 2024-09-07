package org.example.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String name;
    private Integer mileage;
    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "enum")
    private CarType type;
    @Column(name = "instructor_id")
    private Integer instructorId;
    @Column(name = "students_count")
    private Integer studentsCount;
    @Column(name = "all_price")
    private Integer allPrice;
    @Column(name = "price_per_trip")
    private float pricePerTrip;

}
