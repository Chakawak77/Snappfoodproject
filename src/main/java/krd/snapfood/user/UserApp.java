package krd.snapfood.user;

import krd.snapfood.address.Address;
import krd.snapfood.base.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="tbl_user")
@Audited
public class UserApp extends BaseEntity {

    private String userName;
    private String password;
    private String phone;

    @OneToMany(mappedBy = "userApp",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Address> addresses;


}

