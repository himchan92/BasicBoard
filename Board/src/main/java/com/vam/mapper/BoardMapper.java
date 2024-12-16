package com.vam.mapper;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardMapper {
	
	//등록
	public void enroll(BoardVO board);
	
	//게시판 목록
	public List<BoardVO> getList();
	
	//조회
	public BoardVO getPage(int bno);
	
	//수정
	public int modify(BoardVO board);
	
	//삭제
	public int delete(int bno);
}
