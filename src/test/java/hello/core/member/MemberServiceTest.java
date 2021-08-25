package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

//    MemberService memberService = new MemberServiceImpl();

    MemberService memberService;

    @BeforeEach
    public void beforeEasch(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //given
        Member memberB = new Member(2L, "memberB", Grade.BASIC);
        //when
        memberService.join(memberB);
        Member findMember = memberService.findMember(2L);
        //then
        Assertions.assertThat(memberB).isEqualTo(findMember);
    }
}
