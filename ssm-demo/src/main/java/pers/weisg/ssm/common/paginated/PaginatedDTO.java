package pers.weisg.ssm.common.paginated;

import java.io.Serializable;

/** 
 * @Description: 分页的DTO
 * @author WEISANGNG   
 * @date 2017年12月24日   
 */
public class PaginatedDTO implements Serializable {

	private static final long serialVersionUID = -8574882793247791810L;
	
	private long fullListSize = -1L;//总记录数
	private int pageSize = -1;//每页显示记录数
	private int pageNumber = -1;//当前页数
	@SuppressWarnings("unused")
	private int startRowNum = -1;//查询开始行号
	@SuppressWarnings("unused")
	private int endRowNum = -1;//查询结束行号
	private int totalPage;//总页数
	public long getFullListSize() {
		return fullListSize;
	}
	public void setFullListSize(long fullListSize) {
		this.fullListSize = fullListSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getStartRowNum() {
		return this.pageSize * (this.pageNumber - 1);
	}
	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}
	public int getEndRowNum() {
		return this.pageSize * this.pageNumber;
	}
	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
