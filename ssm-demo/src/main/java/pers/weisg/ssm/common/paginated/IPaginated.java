package pers.weisg.ssm.common.paginated;

public interface IPaginated {

	/**
	 * @Description:获取当前页数
	 * @return int 当前页是第几页
	 * @author WEISANGNG
	 * @date 2017年12月24日
	 */
	public int getPageNumber();

	/**
	 * @Description:获取每页显示的数量
	 * @return int 每页显示记录数
	 * @author WEISANGNG
	 * @date 2017年12月24日
	 */
	public int getPageSize();

	/**
	 * @Description:获取总记录数
	 * @return long 记录总数
	 * @author WEISANGNG
	 * @date 2017年12月24日
	 */
	public long getFullListSize();
}
