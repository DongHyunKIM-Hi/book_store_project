package com.example.book_store_project;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/hi")
public class HiController {

    @GetMapping
    public String hi() {
        return "h2h2";
    }
}


// 스프링 프로젝트 하나 만들었따.
// DB 여러분 로컬에 깔려 있는 postgresql 사용한것이고
// postgresql의 db_project 데이터 베이스 사용했습니다.

// 다시 한번 더 푸쉬를 진행하겠습니다!