package com.blog.service;

import com.blog.domain.Article;
import com.blog.dto.AddArticleRequest;
import com.blog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) { // save는 JpaRepository에서 지원하는 저장 메서드 save로 AddArticleRequest 클래스에 저장된 값들을 article 데이터 베이스에 저장
        return blogRepository.save(request.toEntity());
    }

    // 데이터 베이스에 저장되어 있는 글을 모두 가져오는 메서드
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    // 블로그 글 하나 조회
    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id)); // 엔티티 조회하고 없으면 예외 발생
    }

    // 블로그 글 삭제
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

}
