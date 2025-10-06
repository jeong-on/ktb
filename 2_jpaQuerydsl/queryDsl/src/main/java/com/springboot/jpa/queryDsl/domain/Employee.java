package com.springboot.jpa.queryDsl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Entity
@Getter @Setter
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emp_id;
    private String emp_name;

    // 연관관계 주인 (FK 보유)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    public Employee() {}

    public Employee(Long id, String emp_id, String emp_name, Department department) {
        this.id = id;
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.department = department;
    }
}
