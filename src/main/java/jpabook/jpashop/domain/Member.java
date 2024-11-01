package jpabook.jpashop.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String name;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") // 나는 주인이 아니에요!
    // order 테이블에 있는 member 필드에 의해 매핑된거야! 읽기 전용이 된다.
    // 여기에 값을 넣는다고 해서 FK 값이 변경되지 않는다!
    private List<Order> orders = new ArrayList<>();
}
