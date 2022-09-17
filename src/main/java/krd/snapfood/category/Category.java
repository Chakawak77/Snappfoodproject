package krd.snapfood.category;

import krd.snapfood.base.BaseEntity;
import krd.snapfood.supplier.Supplier;
import lombok.Data;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Audited
@Table(name = "tbl_category")
public class Category extends BaseEntity {


    private String title;
    private String icon;


    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Supplier> supplierList;
}
