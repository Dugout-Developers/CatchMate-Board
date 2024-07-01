package com.catchmate.board.service;

import com.catchmate.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardMapper boardMapper;

    @Override
    public List<String> getAllTitles() {
        List<String> titles = boardMapper.getAllTitles();

        return titles;
    }
}
