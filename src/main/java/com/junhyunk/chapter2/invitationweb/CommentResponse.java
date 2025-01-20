package com.junhyunk.chapter2.invitationweb;

public record CommentResponse(String name, String content) {

    public static CommentResponse fromEntity(Comment comment) {
        return new CommentResponse(comment.getName(), comment.getContent());
    }
}
