package krd.snapfood.basket;

import krd.snapfood.address.Address;
import krd.snapfood.base.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Audited
@Entity
@Table(name="tbl_basket")
public class Basket extends BaseEntity {

    private String title;
    private Long paidPrice;



    @ManyToOne
    @JoinColumn(name ="address")
    private Address address;



}