package com.nju.detection.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(catalog = "userdatabase")
public class Product implements Serializable {

    /**
     * 项目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long proID;
    /**
     * 项目名
     */
    private String name;
    /**
     * 传入用户id
     */
    private Long userId;
}
