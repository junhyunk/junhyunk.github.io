package com.junhyunk.chapter2.invitationweb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<Comment, Long> {
}
