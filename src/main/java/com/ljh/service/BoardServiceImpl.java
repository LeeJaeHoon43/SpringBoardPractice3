package com.ljh.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.ljh.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO boardDAO; 
}
