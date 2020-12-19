package com.example.projectdelivery;

public class worklist_Item
{
	public String m_strSubject ;
	public String m_strContent ;
	public int m_iUserID ;
	public int m_iWorkID ;
	public int m_iMatchingID ;
	public boolean m_iWorkEnd ;
	public int m_iValue ;
	
	worklist_Item ( DBHelper dbHelper )
	{
		// dbHelper를 통해서 db 가져오기
	}
	worklist_Item ( String strSubject , int iValue )			// 구현 시범용
	{
		m_strSubject = strSubject ;
		m_strContent = "내용" ;
		m_iUserID = 4444 ;
		m_iWorkID = 5555 ;
		m_iMatchingID = 6666 ;
		m_iWorkEnd = false ;
		m_iValue = iValue ;
	}
}
