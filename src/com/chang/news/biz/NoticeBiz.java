package com.chang.news.biz;

import java.util.List;

import com.chang.news.bean.NoticeBean;


/**
 * 用于对用户信息进行操作的业务层，主要用于调用其实现类的对应的方法
 * 
 * @since 2015年8月20号
 * @author 常耀华
 * @version v1.0
 *
 */
public interface NoticeBiz {

	public boolean insertNewsData(List<NoticeBean> noticeList,String sqlTableName);

	public List<NoticeBean> fetchAllNotice();

	public List<NoticeBean> fetchNoticeByPageNO(int pageNo, String sqlTableName);

	public int fetchNoticeRows(String sqlTableName);

	public NoticeBean fetchFirstNotice(String sqlTableName);

	public List<NoticeBean> fetchTopNotice();
	
}
