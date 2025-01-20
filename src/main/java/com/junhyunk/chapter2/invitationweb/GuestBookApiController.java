package com.junhyunk.chapter2.invitationweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
//@CrossOrigin(origins = "localhost:4322", allowedHeaders = "*")
public class GuestBookApiController {

    private final GuestBookService guestBookService;

    public GuestBookApiController(GuestBookService guestBookService) {
        this.guestBookService = guestBookService;
    }

    @GetMapping(value = "/api/comment")
    public ResponseEntity<List<CommentResponse>> getComments() {
        var commentResponses = guestBookService.getAll().stream()
                .map(CommentResponse::fromEntity)
                .toList();
        return ResponseEntity.ok()
                .body(commentResponses);
    }

    @PostMapping(value = "/api/comment")
    public ResponseEntity<CommentResponse> addComment(@RequestBody CreateCommentRequest request) {
        var commentResponse = CommentResponse.fromEntity(guestBookService.create(request.name(), request.content()));
        return ResponseEntity.ok()
                .body(commentResponse);
    }
}
