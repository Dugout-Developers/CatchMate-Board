package com.catchmate.board.controller;

import com.catchmate.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping(value = "/init")
    public ResponseEntity<?> projectInit(){
        List<String> allTitles = boardService.getAllTitles();
        return new ResponseEntity<List<String>>(allTitles, HttpStatus.OK);
    }

}
