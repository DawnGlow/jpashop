package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {
    private Long id; // 상품 수정을 위해서 폼 객체에 id가 있어야 함
    @NotEmpty(message = "상품 이름은 필수 입니다.")
    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;
}
