package com.kh.chap04_assist.part01_buffer.run;

import com.kh.chap04_assist.part01_buffer.mode.dao.BufferDao;

public class BufferRun {

	public static void main(String[] args) {

		BufferDao dao = new BufferDao();
		//dao.fileSave();
		dao.fileRead();
		
		
	}

}
