package krd.snapfood.food;

import krd.snapfood.base.BaseEntity;
import krd.snapfood.category.Category;
import krd.snapfood.supplier.Supplier;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Audited
@Table(name="tbl_food")
public class Food extends BaseEntity {

    private String name;
    private Double price;
    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Supplier supplier;



}
