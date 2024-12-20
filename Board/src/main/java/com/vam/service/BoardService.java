package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {

	//등록
	public void enroll(BoardVO board);
	
	//목록
	public List<BoardVO> getList();
	
	//단건 조회
	public BoardVO getPage(int bno);
	
	//수정
	public int modify(BoardVO board);
	
	//삭제
	public int delete(int bno);
}
