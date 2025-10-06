package com.springboot.jpa.queryDsl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Setter;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Department {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String dept_id;
    private String dept_name;

    // 양방향 매핑 : Department -> Employee
    @OneToMany(mappedBy = "department") // 읽기 전용, FK는 Department가 관리
    private List<Employee> employees = new ArrayList<>();

    public Department() {}

    public Department(Long id, String dept_id, String dept_name) {
        this.id = id;
        this.dept_id = dept_id;
        this.dept_name = dept_name;
    }
}
