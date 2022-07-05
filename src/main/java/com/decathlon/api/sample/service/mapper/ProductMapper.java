package com.decathlon.api.sample.service.mapper;

import com.decathlon.api.sample.domain.Product;
import com.decathlon.api.sample.service.dto.ProductDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {}
