package com.vam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {

	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testEnroll() {
		BoardVO vo = new BoardVO();
		vo.setTitle("service test");
		vo.setContent("service test");
		vo.setWriter("service test");
		
		service.enroll(vo);
	}
	
	@Test
	public void testGetList() {
		service.getList().forEach(board -> log.info("" + board));
	}
	
	@Test
	public void testGETPage() {
		int bno = 6;
		
		log.info("" + service.getPage(bno));
	}
}