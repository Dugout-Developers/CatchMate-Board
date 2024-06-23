package com.catchmate.board.mapper;

import com.catchmate.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper {
    //Mapper 파일에서 ID값을 통해 쿼리를 연결해주는 Interface
    Optional<Board> getBoardById(Long id);
    List<String> getAllTitles();
}
