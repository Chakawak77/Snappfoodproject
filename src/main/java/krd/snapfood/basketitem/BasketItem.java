package krd.snapfood.basketitem;

import krd.snapfood.base.BaseEntity;
import krd.snapfood.basket.Basket;
import krd.snapfood.suppliercategory.SupplierCategory;
import lombok.Data;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Audited
@Table(name="tbl_basket_item")
public class BasketItem extends BaseEntity {

    private String title;
    private Double price;
    private String icon;
    private Long count;

    @ManyToOne
    @JoinColumn(name = "supplier_category")
    private SupplierCategory supplierCategory;

    @ManyToOne
    @JoinColumn(name = "basketItem")
    private Basket basket;
}
