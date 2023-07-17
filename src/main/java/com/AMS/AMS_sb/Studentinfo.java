package com.AMS.AMS_sb;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Student")
public class Studentinfo {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String fistName;
    private String lastName;
    private String email;
    private String gender;
    private Integer teacherId;
    private String section;
}
