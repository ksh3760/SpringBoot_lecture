package org.zerock.ex2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2.entity.Memo;

import java.util.List;

// MemoRepository는 인터페이스 자체이고, JpaRepository 인터페이스를 상속
// Spring Data JPA는 인터페이스 선언만으로도 자동으로 스프링의 bean으로 등록된다.
// (스프링이 내부적으로 인터페이스 타입에 맞는 객체를 생성하여 bean으로 등록)
public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findByMnoBetweenOrderByMnoDesc(Long fronm, Long to);

    // 쿼리 메소드와 pageable의 결합
    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);

    // deleteBy로 시작하는 삭제처리
    void deleteMemoByMnoLessThan(Long num);

}
