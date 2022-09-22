package com.ll.exam.mybatis_exam_2022_09_22.app.article.repository;

import com.ll.exam.mybatis_exam_2022_09_22.app.article.dto.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleRepository {
    @Select("""
            <script>
            SELECT * 
            FROM article
            </script>
            """
    )
    List<Article> getArticles();
}
