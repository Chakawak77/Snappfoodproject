package krd.snapfood.supplier_category;

import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierCategoryMapper {

    SupplierCategory toSupplierCategory(SupplierCategoryDTO supplierCategoryDTO);
    SupplierCategoryDTO toSupplierCategoryDTO(SupplierCategory supplierCategory);

    List<SupplierCategory> toSupplierCategory(List<SupplierCategoryDTO> supplierCategoryDTOS);
    List<SupplierCategoryDTO> toSupplierCategoryDTO(List<SupplierCategory> supplierCategories);

}
