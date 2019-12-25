package com.vue.jypark.index;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class IndexS {

    public List<String> hello() {
        String text = "안녕하세요. 박준용입니다.";
        String text2 = "이곳은 Vue.js 템플릿을 제작하기 위한 홈페이지 입니다.";
        return Arrays.asList(text, text2);
    }

}
