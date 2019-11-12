package com.offcn.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "dong")
public class User {
    @Id
//    @GeneratedValue
    @KeySql(useGeneratedKeys = true)
    private Long eid;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private Date birthday;

}
