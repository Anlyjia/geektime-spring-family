package com.jia.jpacomplexdemo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @description:
 * @author: jia
 * @create: 2020-07-25 12:11
 * @Version 1.0
 **/
@Entity
@Table(name = "T_ORDER")
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CofferOrder extends BaseEntity {
    private String customer;
    @ManyToMany
    @JoinTable(name = "T_ORDER_COFFEE")
    @OrderBy("id")
    private List<Coffee> items;
    @Enumerated
    @Column(nullable = false)
    private OrderState state;
}