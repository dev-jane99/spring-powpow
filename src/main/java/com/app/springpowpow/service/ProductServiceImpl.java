package com.app.springpowpow.service;

import com.app.springpowpow.domain.ProductVO;
import com.app.springpowpow.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Override
    public void insertNewProduct(ProductVO productVO) {
        productDAO.save(productVO);
    }

    @Override
    public Optional<ProductVO> selectProductById(Long id) {
        return productDAO.findProductById(id);
    }

    @Override
    public List<ProductVO> selectAllProducts() {
        return productDAO.findAllProduct();
    }

    @Override
    public List<ProductVO> selectAllProductsBySellerId(Long memberId) {
        return productDAO.findAllProductBySeller(memberId);
    }

    @Override
    public void updateProduct(ProductVO productVO) {
        productDAO.updateProduct(productVO);
    }

    @Override
    public void deleteProduct(Long id) {
        productDAO.deleteProduct(id);
    }
}
