package com.example.projectdelivery;

import com.naver.maps.geometry.LatLng;

public class userlist_item
{
	public String m_strName ;
	private LatLng m_latLng ;
	public int m_iUserID ;
	public boolean m_bMale ;
	
	userlist_item ( DBHelper dbHelper )
	{
		// dbHelper를 통해서 db 가져오기
	}
	userlist_item ( String strName , boolean bMale )			// 구현 시범용
	{
		m_strName = strName ;
		m_iUserID = 4444 ;
		m_bMale = bMale ;
	}
}
