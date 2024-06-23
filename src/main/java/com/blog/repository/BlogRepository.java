package com.blog.repository;

import com.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> { // 엔티티 Ariticle 과 엔티티의 pk타입 long을 인수로 넣어서 BlogRepository 사용할 때 JpaRepository가 제공하는 메서드 사용가능


}
