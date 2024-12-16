package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {

	//등록
	public void enroll(BoardVO board);
	
	//목록
	public List<BoardVO> getList();
}
