package krd.snapfood.supplier;

import krd.snapfood.base.BaseEntity;
import krd.snapfood.basket.Basket;
import krd.snapfood.category.Category;
import krd.snapfood.suppliercategory.SupplierCategory;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Audited
@Entity
@Table(name = "tbl_item")
public class Supplier extends BaseEntity {

    private String title;
    private String userName;
    private String password;
    private String linkImage;
    private Point<G2D> location;


    @NotNull
    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @OneToMany(mappedBy = "supplier",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<SupplierCategory> supplierCategories;

    @OneToMany(mappedBy = "supplier",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Basket> baskets;

}
