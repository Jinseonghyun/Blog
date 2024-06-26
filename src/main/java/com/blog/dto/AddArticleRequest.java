package com.blog.dto;

import com.blog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest { // dto 는 계층끼리 데이터를 교환하기 위해 사용하는 객체

    private String title;
    private String content;

    public Article toEntity() { // 생성자를 사용해 객체 생성
        return Article.builder()  // toEntity 는 빌더 패턴을 사용해 DTO를 엔티티로 만들어 주는 메서드
                .title(title)     // 추후 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도
                .content(content)
                .build();
    }
}
