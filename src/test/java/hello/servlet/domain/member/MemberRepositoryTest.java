package hello.servlet.domain.member;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    public void save() {
        // given - 설정
        Member member = new Member("hello", 20);

        // when - 로직실행
        Member savedMember = memberRepository.save(member);
        // then - 결과
        Member findMember = memberRepository.findById(savedMember.getId());
        assertThat(findMember).isEqualTo(savedMember);

    }

    @Test
    public void findAll() {
        // given - 설정
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);
        memberRepository.save(member1);
        memberRepository.save(member2);
        // when - 로직실행

        List<Member> result = memberRepository.findAll();
        // then - 결과
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);
    }


}
