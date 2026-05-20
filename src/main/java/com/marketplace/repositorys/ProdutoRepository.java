package com.marketplace.repositorys;

import com.marketplace.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {
}
