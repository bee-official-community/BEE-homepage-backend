package com.bee.beehomepagebackend.admin.controller;

import com.bee.beehomepagebackend.recruitment.RecruitmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/recruits")
@RequiredArgsConstructor
public class RecruitmentAdminController {

    private final RecruitmentRepository recruitmentRepository;

    @GetMapping
    public String getRecruitmentMain() {
        return "admin-recruitment-main";
    }
}
