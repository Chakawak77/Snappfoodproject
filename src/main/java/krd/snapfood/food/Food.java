package krd.snapfood.food;

import krd.snapfood.base.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Audited
@Table(name="tbl_food")
public class Food extends BaseEntity {

    private String name;
    private Double price;
    private String description;


}
