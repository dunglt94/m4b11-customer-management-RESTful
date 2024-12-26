package com.example.customermanagementrestful.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T object);

    void delete(Long id);
}