package com.junhyunk.chapter2.invitationweb;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comment")
@Builder(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    public static Comment of(String name, String content) {
        return Comment.builder()
                .name(name)
                .content(content)
                .build();
    }
}
