package com.bee.beehomepagebackend.generation.admin.question.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateQuestionRequest {

    private Integer order;
    private String content;

    @Builder
    public CreateQuestionRequest(Integer order, String content) {
        this.order = order;
        this.content = content;
    }

    public CreateQuestionServiceRequest toServiceRequest() {
        return CreateQuestionServiceRequest.builder()
                .order(order)
                .content(content)
                .build();
    }
}
