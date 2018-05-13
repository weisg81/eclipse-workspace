package pers.weisg.ssm.common.paginated;

import java.util.HashMap;
import java.util.Map;

/** 
 * @Description:分页工具类
 * @author WEISANGNG   
 * @date 2017年12月24日   
 */
public class PaginatedUtil {

	private static final String PAGE_NUM="pageNum";//当前页数
	private static final String PAGE_SIZE="pageSize";//每页显示的数量
	private static final String TOTAL_COUNT="totalCount";//记录总数
	private static final String TOTAL_PAGE="totalPage";//总页数
	
	/**
	 * @Description:组装分页查询使用的DTO
	 * @param currentPage
	 * @param pageSize
	 * @return PaginatedDTO
	 * @author WEISANGNG
	 * @date 2017年12月24日
	 */
	public static PaginatedDTO getPaginatedDTO(int currentPage,int pageSize){    	
    	PaginatedDTO page =new PaginatedDTO();
		page.setPageSize(pageSize);;
		page.setPageNumber(currentPage);
		return page;
    }
	
	/**
	 * @Description:组装分页显示的MAP
	 * @param paginatedDTO
	 * @return Map<String,Object>
	 * @author WEISANGNG
	 * @date 2017年12月24日
	 */
	public static Map<String,Object> getPaginatedMap(PaginatedDTO paginatedDTO){
    	Map<String,Object> pager =new HashMap<String,Object>();    	
        pager.put(PAGE_NUM, paginatedDTO.getPageNumber());
        pager.put(PAGE_SIZE, paginatedDTO.getPageSize());
        pager.put(TOTAL_COUNT, paginatedDTO.getFullListSize());
        pager.put(TOTAL_PAGE, paginatedDTO.getTotalPage());
		return pager;
    }
}
