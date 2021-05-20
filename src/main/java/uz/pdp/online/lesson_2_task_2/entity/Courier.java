package uz.pdp.online.lesson_2_task_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Courier {

    @Id
    @GeneratedValue
    private Integer id;

    private String fullName;

    private String email;

    private String message;

}
