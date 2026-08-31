package com.roniustek.library.member.memberrepository;

import com.roniustek.library.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}
