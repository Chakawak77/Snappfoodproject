package krd.snapfood.supplier_category;

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
@Table(name = "tbl_supplier_category")
public class SupplierCategory extends BaseEntity {

    private String title;


    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    @OneToMany(mappedBy = "supplierCategory",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<BasketItem> basketItems;
}
