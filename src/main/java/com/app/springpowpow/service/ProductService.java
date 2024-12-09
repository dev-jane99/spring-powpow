package com.app.springpowpow.service;

import com.app.springpowpow.domain.ProductVO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

//     상품 등록
    public void insertNewProduct(ProductVO productVO);

//    상품 단일
    public Optional<ProductVO> selectProductById(Long id);

//    상품 전체
    public List<ProductVO> selectAllProducts();

//    특정 판매자의 상품전체
    public List<ProductVO> selectAllProductsBySellerId(Long memberId);

//    상품 수정
    public void updateProduct(ProductVO productVO);

//    상품 삭제
    public void deleteProduct(Long id);
}
