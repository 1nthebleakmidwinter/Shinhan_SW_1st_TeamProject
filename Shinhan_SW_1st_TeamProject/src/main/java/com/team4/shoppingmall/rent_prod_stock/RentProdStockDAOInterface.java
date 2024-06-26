package com.team4.shoppingmall.rent_prod_stock;

import java.util.List;

public interface RentProdStockDAOInterface {

	// 대여상품상세
	public RentProdStockDTO selectById(Integer stock_id);

	// 대여상품목록
	public List<RentProdStockDTO> selectAll();

	// 대여상품등록
	public int rentProdInsert(RentProdStockDTO rentprod);

	// 대여상품수정
	public int rentProdUpdate(Integer stock_id);

	// 대여상품삭제
	public int rentProdDelete(Integer stock_id);

}
