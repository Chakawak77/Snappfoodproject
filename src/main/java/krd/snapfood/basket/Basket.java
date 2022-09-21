package krd.snapfood.basket;

import krd.snapfood.address.Address;
import krd.snapfood.base.BaseEntity;
import krd.snapfood.basket_item.BasketItem;
import krd.snapfood.supplier.Supplier;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

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


    @ManyToOne
    @JoinColumn(name = "supplier")
    private Supplier supplier;


    @OneToMany(mappedBy = "basket",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<BasketItem> basketItem;

}