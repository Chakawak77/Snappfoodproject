package krd.snapfood.address;

import krd.snapfood.base.BaseEntity;
import krd.snapfood.basket.Basket;
import krd.snapfood.user.UserApp;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Audited
@Table(name = "tbl_address")
public class Address extends BaseEntity {

    private Point<G2D> location;
    private String address;
    private String phoneNumber;



    @ManyToOne
    @JoinColumn(name = "userId")
    private UserApp userApp;

    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Basket> buyLists;

}
