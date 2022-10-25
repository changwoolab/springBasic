package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // 메서드 이름만으로 조회 기능 만들어줌 JPQL "select m from Member m where m.name = ?"
    @Override
    Optional<Member> findByName(String name);
}
