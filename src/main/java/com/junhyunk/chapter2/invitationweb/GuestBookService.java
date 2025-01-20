package com.junhyunk.chapter2.invitationweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GuestBookService {

    private final GuestBookRepository guestBookRepository;

    public GuestBookService(GuestBookRepository guestBookRepository) {
        this.guestBookRepository = guestBookRepository;
    }

    public List<Comment> getAll() {
        return guestBookRepository.findAll();
    }

    public Comment create(String name, String content) {
        var comment = Comment.of(name, content);
        return guestBookRepository.save(comment);
    }

}
