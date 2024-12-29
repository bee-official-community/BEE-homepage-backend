package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.dto.request.ApplyRecruitRequest;
import com.bee.beehomepagebackend.recruitment.dto.response.ApplyRecruitResponse;
import com.bee.beehomepagebackend.recruitment.question.QuestionService;
import com.bee.beehomepagebackend.recruitment.question.response.GetAllQuestionsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recruits")
@RequiredArgsConstructor
@Slf4j
public class RecruitmentController {

    private final RecruitmentService recruitmentService;
    private final QuestionService questionService;

    @GetMapping("/apply")
    public ResponseEntity<GetAllQuestionsResponse> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @PostMapping("/apply")
    public ResponseEntity<ApplyRecruitResponse> applyRecruit(@RequestBody ApplyRecruitRequest request) {
        log.info("AnswerRequest: {}", request.getAnswerRequests().toString());
        return ResponseEntity.ok(recruitmentService.processApplication(request.toServiceRequest()));
    }

}
