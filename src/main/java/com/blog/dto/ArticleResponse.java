package com.blog.dto;

import com.blog.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    // 글의 제목과 내용 필드를 가질 수 있게  -> 엔티티를 인수로 받는 생성자
    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
