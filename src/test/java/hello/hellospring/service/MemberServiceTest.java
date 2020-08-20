package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService = new MemberService();

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("hello");
        //when

        Long saveId=memberService.join(member);

        //then
        Member find=memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(find.getName());
    }
    @Test
    public void duplicate(){
        //given
        Member member1=new Member();
        member1.setName("spring");

        Member member2=new Member();
        member2.setName("spring");
        //when

        memberService.join(member1);

        //then
    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}