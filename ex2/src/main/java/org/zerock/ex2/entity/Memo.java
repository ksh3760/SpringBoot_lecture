package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity // 해당 클래스가 엔티티를 위한 클래스라고 정의하며, 해당 클래스의 인스턴스들이 JPA로 관리되는 엔티티 객체라는 걸 의미
@Table(name = "tbl_memo")   //어떤 테이블로 생성할 것인지에 대한 정보
@ToString
@Getter
@Builder    // @AllArgsConstructor, @NoArgsConstructor를 같이 처리해야 컴파일 에러가 발생하지 않는다.
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

        @Id // PK(primary key)에 해당하는 특정 필드를 지정
        @GeneratedValue(strategy = GenerationType.IDENTITY) // PK를 자동으로 생성함
        private Long mno;

        @Column(length = 200, nullable = false)
        private String memoText;

}
