package com.chang.news.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.chang.news.bean.NoticeBean;
import com.chang.news.biz.NoticeBiz;
import com.chang.news.biz.NoticeBizImpl;

@WebServlet("/TopNoticeServlet")
public class TopNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		NoticeBiz noticeBiz = new NoticeBizImpl();

		List<NoticeBean> noticeBeanList = noticeBiz.fetchTopNotice();
		String jsonArray = JSON.toJSONString(noticeBeanList);
		response.getOutputStream().write(jsonArray.getBytes("UTF-8"));
		response.setContentType("text/json; charset=UTF-8"); // JSON������Ϊtext/json
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
