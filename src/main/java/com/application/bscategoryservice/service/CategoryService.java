package com.application.bscategoryservice.service;

import com.application.bscategoryservice.dto.category.CategoryDto;
import com.application.bscategoryservice.dto.category.CreateCategoryRequestDto;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface CategoryService {
    List<CategoryDto> findAll(Pageable pageable);

    CategoryDto createCategory(CreateCategoryRequestDto categoryDto);

    CategoryDto getById(Long categoryId);

    CategoryDto update(Long categoryId, CreateCategoryRequestDto requestDto);

    void deleteById(Long categoryId);
}
